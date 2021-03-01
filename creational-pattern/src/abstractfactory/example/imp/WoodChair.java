package abstractfactory.example.imp;

import abstractfactory.example.supper.Chair;

public class WoodChair implements Chair {

    @Override
    public void create() {
        System.out.println("create wood chair");
    }
}
