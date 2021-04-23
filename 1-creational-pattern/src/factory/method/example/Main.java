package factory.method.example;

import factory.method.example.factory.BankFactory;
import factory.method.example.factory.BankType;
import factory.method.example.supper.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
    }
}
