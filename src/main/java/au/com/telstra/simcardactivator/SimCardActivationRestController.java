package au.com.telstra.simcardactivator;

import org.springframework.web.bind.annotation.*;
import au.com.telstra.simcardactivator.SimCard;

@RestController
public class SimCardActivationRestController {
    private final DatabaseConduit databaseConduit;
    private final SimCardActuationHandler simCardActuationHandler;

    public SimCardActivationRestController(DatabaseConduit databaseConduit, SimCardActuationHandler simCardActuationHandler) {
        this.simCardActuationHandler = simCardActuationHandler;
        this.databaseConduit = databaseConduit;
    }
    @PostMapping(value = "/activate")
    public void handleActivationRequest(@RequestBody SimCard simCard) {
        var actuationResult = simCardActuationHandler.actuate(simCard);
        databaseConduit.save(simCard, actuationResult);
    }

    @GetMapping(value = "/query")
    public SimCard handleActivationRequest(@RequestParam Long simCardId) {
        return databaseConduit.querySimCard(simCardId);
    }
}