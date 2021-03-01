package factory.method.example.factory;

import factory.method.example.sub.TPBank;
import factory.method.example.sub.VietcomBank;
import factory.method.example.supper.Bank;

public class BankFactory {
    public BankFactory() {
    }

    public static final Bank getBank(BankType bankType){
        switch (bankType){
            case TPBANK:
                return new TPBank();

            case VIETCOMBANK:
                return new VietcomBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
