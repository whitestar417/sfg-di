package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dh on 4/22/21
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World - Property";
    }
}
