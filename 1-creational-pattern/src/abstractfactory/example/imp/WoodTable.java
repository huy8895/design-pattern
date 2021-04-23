package abstractfactory.example.imp;

import abstractfactory.example.supper.Table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("create wood table");
    }
}
