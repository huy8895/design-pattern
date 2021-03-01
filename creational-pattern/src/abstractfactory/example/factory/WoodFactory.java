package abstractfactory.example.factory;

import abstractfactory.example.imp.WoodChair;
import abstractfactory.example.imp.WoodTable;
import abstractfactory.example.supper.Chair;
import abstractfactory.example.supper.FurnitureAbstractFactory;
import abstractfactory.example.supper.Table;

public class WoodFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
