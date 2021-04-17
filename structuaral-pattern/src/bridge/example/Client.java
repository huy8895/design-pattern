package bridge.example;

import bridge.example.abstraction.Bank;
import bridge.example.implementation.*;

/**
 * Client: đại diện cho khách hàng sử dụng các chức năng thông qua Abstraction.
 */
public class Client {
    public static void main(String[] args) {
        TPBank tpBank = new TPBank(new CheckingAccount());
        tpBank.actionWithAccount();

        VietcomBank vietcomBank = new VietcomBank(new SavingAccount());
        vietcomBank.actionWithAccount();

        Bank tpbank2 = new TPBank(new TPBankSavingAccount());
        tpbank2.actionWithAccount();

    }
}
