package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

/**
 * Created by dh on 4/22/21
 */
public class I18nEnglishGreetingService implements GreetingService
{
    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository)
    {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting()
    {
        return "Hello World - EN";
    }
}
