package space.springbok.spring6di.controllers;

import space.springbok.spring6di.services.GreetingService;

/**
 *
 * @author John Spangenberg
 */
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
