package abstractfactory.example.factory;

import abstractfactory.example.imp.PlasticChair;
import abstractfactory.example.imp.PlasticTable;
import abstractfactory.example.supper.Chair;
import abstractfactory.example.supper.FurnitureAbstractFactory;
import abstractfactory.example.supper.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
