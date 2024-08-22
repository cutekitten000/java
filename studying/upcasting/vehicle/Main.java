class Main {
    public static void main(String[] args) {
        // Criando objetos das subclasses mais derivadas
        Vehicle vehicle;
        Car electricCar = new ElectricCar();
        Motorcycle sportsMotorCycle = new SportsMotorcycle();
        
        // Upcasting para a superclasse imediata
        vehicle = electricCar; // ElectricCar -> Car -> Vehicle
        vehicle.describe(); // Chama o metodo de ElectricCar

        vehicle = sportsMotorCycle; // SportsMotorcycle -> Motorcycle -> Vehicle
        vehicle.describe(); // Chama o metodo de SportsMotorcycle

        // Upcasting direto para Vehicle
        vehicle = new Car(); 
        vehicle.describe(); // Chama o metodo de Car

        vehicle = new Motorcycle();
        vehicle.describe(); // Chama o metodo de Motorcycle

        // Instancia de Vehicle
        vehicle = new Vehicle();
        vehicle.describe(); // Chama o metodo de Vehicle
    }
}
