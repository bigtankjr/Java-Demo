package factories;

import colors.*;
import interfaces.*;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String type) {
        if(type.equalsIgnoreCase("WHITE")){
            return new White();
        }else if(type.equalsIgnoreCase("BROWN")){
            return new Brown();

        }else if(type.equalsIgnoreCase("BLACK")){
            return new Black();
        }

        return null;
    }
}
