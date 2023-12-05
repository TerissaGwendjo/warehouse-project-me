package personnel;

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

}
