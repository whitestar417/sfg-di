package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by dh on 4/22/21
 */
@Controller
public class I18nController
{
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService)
    {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
        return greetingService.sayGreeting();
    }
}
