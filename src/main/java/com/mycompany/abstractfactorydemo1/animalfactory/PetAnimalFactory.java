package com.mycompany.abstractfactorydemo1.animalfactory;

import com.mycompany.abstractfactorydemo1.animals.Dog;
import com.mycompany.abstractfactorydemo1.animals.Tiger;
import com.mycompany.abstractfactorydemo1.animals.WildDog;
import com.mycompany.abstractfactorydemo1.animals.WildTiger;

public class PetAnimalFactory extends AnimalFactory {

    public PetAnimalFactory() {
        System.out.println("You opt for a pet animal.");
    }
    
    @Override
    public Tiger createTiger(String color) {
        return new WildTiger(color);
    }

    @Override
    public Dog createDog(String color) {
        return new WildDog(color);
    }
    
}
