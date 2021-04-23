package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by dh on 4/21/21
 */
@Controller
public class PropertyInjectedController
{
    @Autowired
    public GreetingService greetingService;

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
