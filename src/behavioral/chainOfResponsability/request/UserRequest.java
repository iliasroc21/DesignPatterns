package behavioral.chainOfResponsability.request;

public class UserRequest {
    private String username;
    private String password;
    private String role;
    private String permission;

    public UserRequest(String username, String password, String role, String permission) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.permission = permission;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getPermission() { return permission; }
}
