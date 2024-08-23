class Developer extends Employee {
    private String favoriteLanguage;
    
    public Developer(String name, double salary, String favoriteLanguage) {
        super(name, salary);
        this.favoriteLanguage = favoriteLanguage;
    }
    
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
    
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName() + ", Salary: " + getSalary() + ", Favorite Language: " + getFavoriteLanguage());
    }
}
