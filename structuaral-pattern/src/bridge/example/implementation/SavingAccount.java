package bridge.example.implementation;

import bridge.example.abstraction.Account;

public class SavingAccount implements Account {
    @Override
    public void execute() {
        System.out.println("saving account");
    }
}
