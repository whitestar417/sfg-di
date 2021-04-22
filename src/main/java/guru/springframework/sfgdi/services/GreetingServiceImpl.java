package guru.springframework.sfgdi.services;

/**
 * Created by dh on 4/21/21
 */
public class GreetingServiceImpl implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World";
    }
}
