class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int emp_id, double salary, double bonus) {
        super(name, emp_id, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        double totalSalary = salary + bonus;
        System.out.println("Total Salary: $" + totalSalary);
    }
    public static void main(String[] args) {
       
        Employee emp = new Employee("John Doe", 1001, 50000.00);
        emp.displayEmployeeDetails();

        DevOpsEngineer devOps = new DevOpsEngineer("Jane Smith", 1002, 60000.00, 5000.00);
        devOps.displayEmployeeDetails();
    }
}