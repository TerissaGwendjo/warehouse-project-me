package personnel;

import java.util.List;

public class User {
    protected String user_name;
    private boolean isAuthenticated;

    // If the provided userName is empty, set the name to "Anonymous"
    public User(String user_name, boolean isAuthenticated) {
        this.user_name = user_name.isEmpty() ? "Anonymous" : user_name;
        //The above code checks if the provided username is an empty string and assigns
        // the String " Anonymous " to it. Otherwise, it assigns the provided 'username'
        this.isAuthenticated = false;
    }

    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public boolean isAuthenticated() {
        return isAuthenticated;
    }
    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + user_name + '\'' +
                ", password='" + isAuthenticated + '\'' +
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
