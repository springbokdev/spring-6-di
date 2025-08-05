package space.springbok.spring6di.controllers;

import space.springbok.spring6di.services.GreetingService;

/**
 *
 * @author John Spangenberg
 */
public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
