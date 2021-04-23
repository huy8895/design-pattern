package factory.method.example.sub;

import factory.method.example.supper.Bank;

public class VietcomBank implements Bank {


    @Override
    public String getBankName() {
        return "VietComBank";
    }
}
