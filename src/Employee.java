public class Employee       //Model
{
    private int employeeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String hiredDate;
    private int salary;

    public int getEmployeeId()
    {
        return employeeId;
    }
    public void setEmployeeId(int employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getGender()
    {
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getHiredDate()
    {
        return hiredDate;
    }
    public void setHiredDate(String hiredDate)
    {
        this.hiredDate = hiredDate;
    }

    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
}