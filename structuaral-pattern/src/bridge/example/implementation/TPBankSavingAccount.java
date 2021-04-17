package bridge.example.implementation;

public class TPBankSavingAccount extends SavingAccount{
    @Override
    public void execute() {
        System.out.println("this bank is saving by TPBank Saving service");
    }
}
