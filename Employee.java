public class Employee {
    protected String name;
    protected int emp_id;
    protected double salary;

    public Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 1001, 50000.00);
        emp.displayEmployeeDetails();

        DevOpsEngineer devOps = new DevOpsEngineer("Jane Smith", 1002, 60000.00, 5000.00);
        devOps.displayEmployeeDetails();
    }
}
