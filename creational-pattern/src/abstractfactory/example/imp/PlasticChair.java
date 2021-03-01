package abstractfactory.example.imp;

import abstractfactory.example.supper.Chair;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("create plastic chair");
    }
}
