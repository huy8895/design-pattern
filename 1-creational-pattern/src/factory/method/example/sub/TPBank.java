package factory.method.example.sub;

import factory.method.example.supper.Bank;

public class TPBank implements Bank {

    @Override
    public String getBankName() {
        return "TPBank";
    }
}
