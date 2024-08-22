class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting de Dog para Animal
        Animal animal2 = new Cat(); // Upcasting de Cat para Animal
        
        animal1.makeSound(); // Chama o makeSound() de Dog
        animal2.makeSound(); // Chama o makeSound() de Cat
    }
}
