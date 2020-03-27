public class MVCPatternDemo1
{
    public static void main(String[] args)
    {
        //fetch employee record based on his roll no from the database
        Employee model = retriveEmployeeFromDatabase();


        //Create a view : to write employee details on console
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(model,view);

        controller.updateView();

        System.out.println();           //An empty line for separation

        //update model data
        controller.setEmployeeLastName("Amir");

        controller.updateView();
    }

    private static Employee retriveEmployeeFromDatabase()
    {
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setFirstName("Muhammad");
        employee.setLastName("Atif");
        employee.setGender("Male");
        employee.setHiredDate("9th October 2017");
        employee.setSalary(100000);
        return employee;
    }
}