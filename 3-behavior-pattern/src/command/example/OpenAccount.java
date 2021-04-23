package command.example;

/**
 * OpenAccount, CloseAccount : là các ConcreteCommand,
 * cài đặt các phương thức của Command, sẽ thực hiện các xử lý thực tế.
 */
public class OpenAccount implements Command{
    private final Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.open();
    }
}
