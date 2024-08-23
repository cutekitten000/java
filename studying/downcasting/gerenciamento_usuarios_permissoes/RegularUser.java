class RegularUser extends User {
    public RegularUser(String username, String password) {
        super(username, password);
    }
    
    @Override
    public void printUserDetails() {
        System.out.println("Username: " + getUsername());
    }
}
