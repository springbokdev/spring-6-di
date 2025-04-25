package space.springbok.spring6di.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author John Spangenberg
 */
@Controller
public class MyController {

    public String sayHello() {
        System.out.println("I'm in the controller");
        return "Hello Everyone!!!";
    }
}
