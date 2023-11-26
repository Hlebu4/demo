package lesson3.Calculator1;

public class CalculatorDemo {
    public static void main(String[] args) {


        Calculator calc = new Calculator();
        calc.x = 5;
        calc.y = 7;

        calc.sum();

        calc.x=7;
        calc.y=5;

        calc.sub();

        calc.x=8;
        calc.y=4;

        calc.mul();
        calc.div();





    }
}

