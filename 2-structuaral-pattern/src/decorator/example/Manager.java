package decorator.example;

public class Manager extends EmployeeDecorator {

    public Manager(EmployeeComponent employee) {
        super(employee);
    }

    void createRequirement() {
        System.out.println(this.employee.getName() + " is create requirements.");
    }


    void assignTask() {
        System.out.println(this.employee.getName() + " is assigning tasks.");
    }


    void managerProgress() {
        System.out.println(this.employee.getName() + " is managing the progress.");
    }

    @Override
    public void doTask() {
        employee.doTask();
        createRequirement();
        assignTask();
        managerProgress();
    }
}
