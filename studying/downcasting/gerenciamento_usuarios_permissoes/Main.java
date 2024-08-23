import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
    
        RegularUser user1 = new RegularUser("Dan", "1234");
        Admin admin = new Admin("Admin1", "111");
        Manager manager = new Manager("manager1", "12345", "Sales");
        
        admin.addPermission("READ");
        admin.addPermission("WRITE");
        admin.addPermission("DELETE");
        
        users.add(user1);
        users.add(admin);
        users.add(manager);
        
        for (User user : users) {
            checkPermissions(user);
        }
    }
    
    public static void checkPermissions(User user) {
        if (user instanceof Admin) {
            Admin admin = (Admin) user;
            
            System.out.println();
            System.out.println("Admin Details:");
            admin.printUserDetails();
        } else if (user instanceof Manager) {
            Manager manager = (Manager) user;
            
            System.out.println();
            System.out.println("Manager Details:");
            manager.printUserDetails();
        } else {
            System.out.println();
            System.out.println("Regular User Details:");
            user.printUserDetails();
        }
    }
}
