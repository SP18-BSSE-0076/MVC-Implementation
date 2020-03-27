public class EmployeeController      //controller
{
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view)
    {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeId(int id)
    {
        model.setEmployeeId(id);
    }
    public int getEmployeeId()
    {
        return model.getEmployeeId();
    }

    public void setEmployeeFirstName(String firstName)
    {
        model.setFirstName(firstName);
    }
    public String getEmployeeFirstName()
    {
        return model.getFirstName();
    }

    public void setEmployeeLastName(String lastName)
    {
        model.setLastName(lastName);
    }
    public String getEmployeeLastName()
    {
        return model.getLastName();
    }

    public void setEmployeeGender(String gender)
    {
        model.setGender(gender);
    }
    public String getEmployeeGender()
    {
        return model.getGender();
    }

    public void setEmployeeHiredDate(String hiredDate)
    {
        model.setHiredDate(hiredDate);
    }
    public String getEmployeeHiredDate()
    {
        return model.getHiredDate();
    }

    public void setEmployeeSalary(int salary)
    {
        model.setSalary(salary);
    }
    public int getEmployeeSalary()
    {
        return model.getSalary();
    }

    public void updateView()
    {
        view.printEmployeeDetails(model.getEmployeeId(),model.getFirstName(), model.getLastName(), model.getGender(), model.getHiredDate(), model.getSalary());
    }
}