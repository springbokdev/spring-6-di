package space.springbok.spring6di.services;

/**
 * @author John Spangenberg
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
