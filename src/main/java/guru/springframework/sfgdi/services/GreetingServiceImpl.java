package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by dh on 4/21/21
 */
@Service
public class GreetingServiceImpl implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hello World";
    }
}
