package personnel;

import java.util.List;

public class Employee extends User {
    //since Employee is a User, we need more information to differentiate them from other users.
    private String password;
    private List<Employee> headOf;

    //Constructor
    public Employee(String user_name, boolean isAuthenticated, String password, List<Employee> headOf) {
        super(user_name, isAuthenticated); //calls the constructor of the parent class
        this.password = password;
        this.headOf = (headOf != null) ? headOf : List.of();
        //If headOf is not null, this.headOf is assigned the value of headOf.
        //If headOf is null, this.headOf is assigned an empty, immutable list created using List.of().
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

    @Override
    public boolean authenticate(String password) {
        //return super.authenticate(password);
        return this.password.equals(password);
    }

    public void order (String item, int amount) {
        System.out.println("Order placed: Item = " + item + ", Amount = " + amount);
    }

    @Override
    public void greet() {
        //super.greet(); // this is a way of calling the parent class to take an action but we want something else
        System.out.println("Hello, " + getUser_name() + "!");
        System.out.println("If you experience a problem with the system,");
        System.out.println("please contact technical support.");
    }

    @Override
    public void bye(List<String> actions) {
        super.bye(actions); //call the parent class to print the standard "thank you" message

        //Print the summary of actions taken during the session
        System.out.println("Summary of Actions:");
        for (String action:actions) {
            System.out.println(action);
        }
    }
}