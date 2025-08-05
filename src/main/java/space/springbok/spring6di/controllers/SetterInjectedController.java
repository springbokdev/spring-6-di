package space.springbok.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import space.springbok.spring6di.services.GreetingService;

/**
 *
 * @author John Spangenberg
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("SeterInjectedController.setGreetingService");
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
