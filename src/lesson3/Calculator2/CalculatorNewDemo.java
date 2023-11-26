package lesson3.Calculator2;

public class CalculatorNewDemo {
    public static void main(String[] args) {

        CalculatorNew calc = new CalculatorNew();

            int result = calc.sum(5 , 3);
            System.out.println("Summa = " + result);

            result = calc.mul(3 , 4);
            System.out.println("Multiplication = " + result);

            result = calc.div(120 , 2);
            System.out.println("Division = " + result);

            result = calc.sub(5, 3, 2);
        System.out.println("Subtraction = " + result);

    }
}
