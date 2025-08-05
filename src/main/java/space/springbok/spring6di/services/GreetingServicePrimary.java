package space.springbok.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 *
 * @author John Spangenberg
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello Primary Greeting Service!!!";
    }
}
