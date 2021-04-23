package command.example;

/**
 * OpenAccount, CloseAccount : là các ConcreteCommand, cài đặt các phương thức của Command,
 * sẽ thực hiện các xử lý thực tế.
 */
public class CloseAccount implements Command{
    private Account account;

    public CloseAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.close();
    }
}
