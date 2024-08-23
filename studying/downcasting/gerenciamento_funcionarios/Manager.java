class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName() + ", Salary: " + getSalary() + ", Bonus: " + getBonus());
    }
}
