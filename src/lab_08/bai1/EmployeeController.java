package lab_08.bai1;

import java.util.Arrays;
import java.util.List;

public class EmployeeController {

    public static void main(String[] args) {
        Employee contractEmployee1 = new ContractEmployee();
        Employee contractEmployee2 = new ContractEmployee();
        Employee fullTimeEmployee1 = new FullTimeEmployee();
        Employee fullTimeEmployee2 = new FullTimeEmployee();
        Employee fullTimeEmployee3 = new FullTimeEmployee();
        new EmployeeController().calculateTotalEmployee(Arrays.asList(contractEmployee1, contractEmployee2, fullTimeEmployee1, fullTimeEmployee2, fullTimeEmployee3));
    }

    public void calculateTotalEmployee(List<Employee> employeeList) {
        Double totalSalary = 0d;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total salary is: " + totalSalary);
    }
}
