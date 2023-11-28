package personnel;

public class Employee extends User {
    //since Employee is a User, we need more information to differentiate them from other users.
    private String employeeId;
    private String jobTitle;

    //Constructor
    public Employee(String name, String password, String employeeId, String jobTitle) {
        super(name, password);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    //Getters and setters
    public String getEmployeeId() {
        return employeeId;
    }
    public String getJobTitle() {
        return jobTitle;
    }


    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    @Override
    public String toString() {
        return "Employee {name=" + getUser_name() + ", password=" + getPassword() +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}