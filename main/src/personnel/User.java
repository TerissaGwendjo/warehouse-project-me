package personnel;

public class User {
    protected String user_name;
    private boolean isAuthenticated;

    public User(String user_name, boolean isAuthenticated) {
        this.user_name = user_name;
        this.isAuthenticated = isAuthenticated;
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
}
