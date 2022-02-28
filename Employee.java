package Day2Assign;

import java.util.function.Predicate;

abstract class Employee {

    private String name;
    
    private int hoursWorked;

    public Employee(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

}

	


