public class EmployeeView        //View
{
    public void printEmployeeDetails(int employeeId, String employeeFirstName, String employeeLastName, String employeeGender, String employeeHiredDate, int employeeSalary)
    {
        System.out.println("Employee: ");

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee First Name: " + employeeFirstName);
        System.out.println("Employee last Name: " + employeeLastName);
        System.out.println("Employee Gender: " + employeeGender);
        System.out.println("Employee Hired Date: " + employeeHiredDate);
        System.out.println("Employee Salary: " + employeeSalary);
    }
}