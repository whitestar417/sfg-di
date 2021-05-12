package guru.springframework.sfgdi.services;

/**
 * Created by dh on 4/22/21
 */
public class PrimaryGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World - From the PRIMARY Bean";
    }
}
