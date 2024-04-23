package com.mycompany.abstractfactorydemo1;

import com.mycompany.abstractfactorydemo1.animalfactory.AnimalFactory;
import com.mycompany.abstractfactorydemo1.animalfactory.PetAnimalFactory;
import com.mycompany.abstractfactorydemo1.animalfactory.WildAnimalFactory;
import com.mycompany.abstractfactorydemo1.animals.Dog;
import com.mycompany.abstractfactorydemo1.animals.Tiger;

public class AbstractFactoryDemo1 {
    public static void main(String[] args) {
        System.out.println("An Abstract Factory demo.");
        
        System.out.println("");
        
        AnimalFactory factory = new WildAnimalFactory();
        
        Dog wildDog = factory.createDog("Orange");
        wildDog.displayMe();
        
        System.out.println("");
        
        Tiger wildTiger = factory.createTiger("Yellow");
        wildTiger.aboutMe();
        wildTiger.inviteDog(wildDog);
        
        System.out.println("\n********\n");
        
        factory = new PetAnimalFactory();
        Dog petDog = factory.createDog("white");
        petDog.displayMe();
        
        System.out.println("");
        
        Tiger petTiger = factory.createTiger("yellow");
        petTiger.aboutMe();
        petTiger.inviteDog(petDog);
    }
}
