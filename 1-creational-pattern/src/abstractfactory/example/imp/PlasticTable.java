package abstractfactory.example.imp;

import abstractfactory.example.supper.Table;

public class PlasticTable implements Table {

    @Override
    public void create() {
        System.out.println("create plastic table");
    }
}
