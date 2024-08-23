class Manager extends User {
    private String department;
    
    public Manager(String username, String password, String department) {
        super(username, password);
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
    @Override
    public void printUserDetails() {
        System.out.println("Username: " + getUsername());
        System.out.println("Department: " + getDepartment());
    }
}
