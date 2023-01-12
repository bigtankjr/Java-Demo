package factories;

import animals.*;
import interfaces.*;

public class AnimalFactory implements AbstractFactory<Object> {
    @Override
    public Animal create(String type) {
        if(type.equalsIgnoreCase("DOG")){
            return new Dog();
        }else if(type.equalsIgnoreCase("DUCK")){
            return new Duck();
        }else if(type.equalsIgnoreCase("BEAR")){
            return new Bear();
        }
        return null;


    }


}
