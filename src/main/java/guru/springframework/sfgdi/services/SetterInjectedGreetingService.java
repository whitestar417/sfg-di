package guru.springframework.sfgdi.services;

/**
 * Created by dh on 4/22/21
 */
public class SetterInjectedGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World - Setter";
    }
}
