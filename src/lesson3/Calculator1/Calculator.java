package lesson3.Calculator1;

public class Calculator {

    public int x;
    public int y;

    public void sum(){
        int result = x + y;
        System.out.println("Summa = " + result);
    };

    public void sub(){
        int result = x - y;
        System.out.println("Subtraction = " + result);
    }

    public void mul() {
        int result = x * y;
        System.out.println("Multiplication = " + result);
    }

    public void div(){
        int result = x / y;
        System.out.println("Division = " + result);
    }


}
