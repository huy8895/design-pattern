package bridge.example.implementation;

import bridge.example.abstraction.Account;

public class CheckingAccount implements Account {
    @Override
    public void execute() {
        System.out.println("checking account");
    }
}
