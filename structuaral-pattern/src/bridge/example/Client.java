package bridge.example;

import bridge.example.implementation.CheckingAccount;
import bridge.example.implementation.SavingAccount;
import bridge.example.implementation.TPBank;
import bridge.example.implementation.VietcomBank;

/**
 * Client: đại diện cho khách hàng sử dụng các chức năng thông qua Abstraction.
 */
public class Client {
    public static void main(String[] args) {
        TPBank tpBank = new TPBank(new CheckingAccount());
        tpBank.actionWithAccount();

        VietcomBank vietcomBank = new VietcomBank(new SavingAccount());
        vietcomBank.actionWithAccount();
    }
}
