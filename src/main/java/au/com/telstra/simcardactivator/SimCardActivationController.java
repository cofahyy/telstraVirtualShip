package au.com.telstra.simcardactivator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springFramework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import au.com.telstra.simcardactivator.foundation.SimCard;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class SimCardActivationController {

    private final SimCardActuationHandler simCardActuationHandler;

    public SimCardActivationRestController(SimCardActuationHandler simCardActuationHandler) {
        this.simCardActuationHandler = simCardActuationHandler;
    }
    @PostMapping(value = "/actuate")
    public void handleActivationRequest(@RequestBody SimCard simCard) {
        var actuationResult = simCardActuationHandler.actuate(simCard);
        System.out.println(actuationResult.getSuccess());
    }
}