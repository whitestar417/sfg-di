package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by dh on 4/21/21
 */
public class SetterInjectedController
{
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
