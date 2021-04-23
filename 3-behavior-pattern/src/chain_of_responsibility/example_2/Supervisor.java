package chain_of_responsibility.example_2;

public class Supervisor extends Approver{
    @Override
    protected boolean canApprove(int days) {
        return days <= 3;
    }

    @Override
    protected void doApproving(LeaveRequest request) {
        System.out.println("Leave request approved for " + request.getDays() + " days by Supervisor");
    }
}
