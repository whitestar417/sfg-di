package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by dh on 4/22/21
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService
{
    @Override
    public String sayGreeting()
    {
        return "Hola Mundo - ES";
    }
}
