package guru.springframework.sfgdi.services;

/**
 * Created by dh on 4/22/21
 */
public class I18nSpanishService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hola Mundo - ES";
    }
}
