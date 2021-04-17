package bridge.example.implementation;

import bridge.example.abstraction.Account;
import bridge.example.abstraction.Bank;

public class TPBank extends Bank {
    public TPBank(Account account) {
        super(account);
    }

    @Override
    public void actionWithAccount() {
        System.out.println("your account in TPBank is : ");
        account.execute();
    }
}
