package personnel;

import java.util.List;

public class User {
    protected String user_name;
    private String password;

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public boolean authenticate (String password) {
        // Placeholder method, always returns false for a standard user
        return false;
    }

    public boolean isNamed (String checkName) {
        // Checks if the provided name equals the user's name.
        return this.user_name.equals(checkName);
    }

    public void order (String item, int amount) {
        System.out.println("Order placed: Item = " + item + ", Amount = " + amount);
    }

    public void greet() {
        System.out.println("Hello, " + user_name + "!");
        System.out.println("Welcome to our Warehouse Database.");
        System.out.println("If you don't find what you are looking for,");
        System.out.println("please ask one of our staff members to assist you.");
    }

    public void bye (List<String> actions) {
        // For a Standard User, print out a thank you message
        System.out.println("Thank you for using the Warehouse Database");
    }

}
