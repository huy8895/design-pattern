package decorator.example;

import java.util.Date;

public class EmployeeConcreteComponent implements EmployeeComponent{
    private String name;

    public EmployeeConcreteComponent(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doTask() {
        System.out.println("// Unassigned task");
    }

    @Override
    public void join(Date joinDate) {
        System.out.println(this.getName() + " join on " + formatDate(joinDate));

    }

    @Override
    public void terminate(Date terminateDate) {
        System.out.println(this.getName() + " terminate on " + formatDate(terminateDate));
    }
}
