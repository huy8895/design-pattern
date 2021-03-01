package abstractfactory.example;

import abstractfactory.example.supper.Chair;
import abstractfactory.example.supper.FurnitureAbstractFactory;
import abstractfactory.example.supper.FurnitureFactory;
import abstractfactory.example.supper.MaterialType;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair chair = factory.createChair();
        chair.create();
    }
}
