package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by dh on 4/21/21
 */
@Controller
public class MyController
{
    public String sayHello()
    {
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
