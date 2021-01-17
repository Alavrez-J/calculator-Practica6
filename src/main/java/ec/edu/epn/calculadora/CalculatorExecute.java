package ec.edu.epn.calculadora;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("Calculator Execute");
        Calculator c = new Calculator();
        int suma = c.addition(4,7);
        System.out.println("c.addition(4,7)="+suma);

        int resta = c.subtraction(4,7);
        System.out.println("c.subtraction(4,7)="+resta);
    }
}
