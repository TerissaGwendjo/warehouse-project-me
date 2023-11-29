package personnel;

import java.util.List;

public class Employee extends User {
    //since Employee is a User, we need more information to differentiate them from other users.
    private String password;
    private List<Employee> headOf;

    //Constructor

    public Employee(String user_name, boolean isAuthenticated, String password, List<Employee> headOf) {
        super(user_name, isAuthenticated);
        this.password = password;
        this.headOf = headOf;
    }

    //Getters and setters
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public List<Employee> getHeadOf() {
        return headOf;
    }
    public void setHeadOf(List<Employee> headOf) {
        this.headOf = headOf;
    }

    @Override
    public String toString() {
        return "Employee {name=" + getUser_name() +
                "password='" + password + '\'' +
                ", headOf=" + headOf +
                '}';
    }
}