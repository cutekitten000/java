import java.util.List;
import java.util.ArrayList;

class Admin extends User {
    private List<String> permissions;
    
    public Admin(String username, String password) {
        super(username, password);
        permissions = new ArrayList<>();
    }
    
    public void addPermission(String permission) {
        permissions.add(permission);
    }
    
    @Override
    public void printUserDetails() {
        System.out.println("Username: " + getUsername());
        System.out.println("Permissions: " + permissions);
    }
}
