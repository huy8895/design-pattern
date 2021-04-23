package bridge.example.implementation;

import bridge.example.abstraction.Account;
import bridge.example.abstraction.Bank;

public class VietcomBank extends Bank {
    public VietcomBank(Account account) {
        super(account);
    }

    @Override
    public void actionWithAccount() {
        System.out.println("your account in VietcomBank is : ");
        account.execute();
    }

}
