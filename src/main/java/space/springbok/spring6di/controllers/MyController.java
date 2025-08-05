package space.springbok.spring6di.controllers;

import org.springframework.stereotype.Controller;
import space.springbok.spring6di.services.GreetingService;
import space.springbok.spring6di.services.GreetingServiceImpl;

/**
 * @author John Spangenberg
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("I'm in the controller");
        return greetingService.sayGreeting();
    }
}
