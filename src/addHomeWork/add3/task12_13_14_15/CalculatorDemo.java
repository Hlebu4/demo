package addHomeWork.add3.task12_13_14_15;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorService calculator = new CalculatorService();
        CalculatorTest test = new CalculatorTest();
        System.out.println(calculator.mul(3,5));

        test.testMul();
        test.testDiv();

        System.out.println(calculator.maxNumberFromThree(7,14,21));

        test.testMaxNumberForThree();
        test.testMaxNumberForThree2();
    }
}
