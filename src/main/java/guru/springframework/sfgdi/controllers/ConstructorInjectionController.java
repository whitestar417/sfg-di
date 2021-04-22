package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by dh on 4/21/21
 */
public class ConstructorInjectionController
{
    private final GreetingService greetingService;

    public ConstructorInjectionController(GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String getGreeting()
    {
        return greetingService.sayGreeting();
    }
}
