package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by dh on 5/11/21.
 */
@Component
public class SingletonBean
{
    public SingletonBean()
    {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope()
    {
        return "I'm a Singleton";
    }
}
