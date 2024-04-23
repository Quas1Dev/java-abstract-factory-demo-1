package com.mycompany.abstractfactorydemo1.animalfactory;

import com.mycompany.abstractfactorydemo1.animals.Dog;
import com.mycompany.abstractfactorydemo1.animals.Tiger;

public abstract class AnimalFactory {
    public abstract Tiger createTiger(String color);
    public abstract Dog createDog(String color);
}
