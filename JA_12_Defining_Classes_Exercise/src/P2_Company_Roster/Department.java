package P2_Company_Roster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees;
    private String department;

    public Department(String name) {
        employees = new ArrayList<>();
        this.department = name;
    }

    public List<Employee> getEmployees  () {
        return this.employees;
    }

    public double calculateAverageSalary () {
        return this.employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public String getDepartment() {
        return this.department;
    }
}

