package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by dh on 4/22/21
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World - From the PRIMARY Bean";
    }
}
