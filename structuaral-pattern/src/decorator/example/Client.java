package decorator.example;

public class Client {
    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("employee");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\n TEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\n MANAGER");

    }
}
