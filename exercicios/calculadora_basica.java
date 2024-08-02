

public class Calculadora {
    public static double soma(double a, double b) {
        return a + b;
    }
    
    public static double subtracao(double a, double b) {
        return a - b;
    }
    
    public static double multiplicacao(double a, double b) {
        return a * b;
    }
    
    public static double divisao(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisao por zero não permitida");
        }
        return a / b;
    }
    
    public static void main(String[] args) {
        try {
            System.out.println("soma: " + soma(3.0, 2.0));
            System.out.println("Subtracao: " + subtracao(3.0, 2.0));
            System.out.println("Multiplicacao: " + multiplicacao(3.0, 2.0));
            System.out.println("Divisao: " + divisao(3.0, 2.0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
