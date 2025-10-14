package au.com.telstra.simcardactivator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springFramework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuateController {
    @GetMapping("/actuate")
    public Actuate actuate(@RequestParam(defaultValue = "89310410106543789301") String iccid @RequestParam(defaultValue = "customer@example.com") String email) {
        return new Actuate(iccid, email);
    }
}