package com.springframework.pets;

/**
 * Created by dh on 5/11/21.
 */
public class PetServiceFactory
{
    public PetService getPetService(String petType)
    {
        switch (petType)
        {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
