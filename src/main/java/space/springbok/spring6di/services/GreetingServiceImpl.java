package space.springbok.spring6di.services;

import org.springframework.stereotype.Service;

/**
 * @author John Spangenberg
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
