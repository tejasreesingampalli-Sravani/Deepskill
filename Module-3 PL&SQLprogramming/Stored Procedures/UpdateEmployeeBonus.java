class Employee {
    int empId;
    String name;
    String department;
    double salary;

    Employee(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class UpdateEmployeeBonus {

    public static void updateEmployeeBonus(
            Employee[] employees,
            String department,
            double bonusPercentage) {

        for (Employee employee : employees) {
            if (employee.department.equalsIgnoreCase(department)) {
                employee.salary += employee.salary * (bonusPercentage / 100);
            }
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "John", "IT", 50000),
            new Employee(2, "Mary", "HR", 45000),
            new Employee(3, "David", "IT", 60000)
        };

        updateEmployeeBonus(employees, "IT", 10);

        for (Employee employee : employees) {
            System.out.println(employee.name +
                    " - Salary: " + employee.salary);
        }
    }
}
