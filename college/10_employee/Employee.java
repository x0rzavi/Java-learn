public class Employee extends Person {
  int employeeId;
  double salary;

  public Employee(String name, int age, int employeeId, double salary) {
    super(name, age);
    this.employeeId = employeeId;
    this.salary = salary;
  }

  public void displayEmployeeDetails() {
    displayPersonDetails();
    System.out.println("Employee ID: " + employeeId + ", Salary: " + salary);
  }
}
