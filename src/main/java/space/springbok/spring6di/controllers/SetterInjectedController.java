package space.springbok.spring6di.controllers;

import space.springbok.spring6di.services.GreetingService;

/**
 *
 * @author John Spangenberg
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
