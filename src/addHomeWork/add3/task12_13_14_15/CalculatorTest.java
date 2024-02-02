package addHomeWork.add3.task12_13_14_15;
/*
 Task 12 Создайте класс CalculatorTest и напишите автоматические тесты для
всех методов класса calculator1

Task 13 Добавьте в класс Calculator метод для определения
чётное число или не чётное.

Task 14 Добавьте в класс calculator1.Calculator метод для определения
максимального из двух целых чисел.

Task 15 Добавьте в класс calculator1.Calculator метод для определения
максимального из трёх целых чисел.
Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго и третьего
- второе число больше первого и третьего
- третье число больше первого и второго
- первые два равны и больше третьего
- ...
- три числа равны
По одному тесту на каждый из сценариев!
 */


public class CalculatorTest {

    int number1 = 10;
    int number2 = 5;

    public void testSum (){
        int resultSum = 15;
        int resultCalculatorSum = new CalculatorService().sum(number1, number2);
        extracted(resultSum, resultCalculatorSum);
    }

    public void testSub (){
        int resultSum = 5;
        int resultCalculatorSum = new CalculatorService().sub(number1, number2);
        extracted(resultSum, resultCalculatorSum);
    }

    public void testMul (){
        int resultSum = 50;
        int resultCalculatorSum = new CalculatorService().mul(number1, number2);
        extracted(resultSum, resultCalculatorSum);
    }

    public void testDiv (){
        int resultSum = 2;
        double resultCalculatorSum = new CalculatorService().div(number1, number2);
        extracted(resultSum, resultCalculatorSum);
    }

    private void extracted(int resultSum, double resultCalculatorSum) {
        if (resultSum == resultCalculatorSum){
            System.out.println("  test = OK ");
        }else System.out.println("  test = FAIL ");
    }

    public void testMaxNumberForThree (){
        double number1 = 3;
        double number2 = 2;
        double number3 = 1;
        double resultMaxNumberForThree = new CalculatorService().maxNumberFromThree(number1, number2, number3);
        if (number1 == resultMaxNumberForThree ){
            System.out.println(" max number test = OK");
        }else System.out.println(" max number test = FAIL ");
    }
    public void testMaxNumberForThree1 (){
        double number1 = 2;
        double number2 = 3;
        double number3 = 1;
        double resultMaxNumberForThree = new CalculatorService().maxNumberFromThree(number1, number2, number3);
        if (number2 == resultMaxNumberForThree ){
            System.out.println(" max number test = OK");
        }else System.out.println(" max number test = FAIL ");
    }
    public void testMaxNumberForThree2 (){
        double number1 = 2;
        double number2 = 1;
        double number3 = 3;
        double resultMaxNumberForThree = new CalculatorService().maxNumberFromThree(number1, number2, number3);
        if (number3 == resultMaxNumberForThree ){
            System.out.println(" max number test = OK");
        }else System.out.println(" max number test = FAIL ");
    }

    public void testMaxNumberForThree3 (){
        double number1 = 2;
        double number2 = 2;
        double number3 = 1;
        double resultMaxNumberForThree = new CalculatorService().maxNumberFromThree(number1, number2, number3);
        if (number1 == resultMaxNumberForThree ){
            System.out.println(" max number test = OK");
        }else System.out.println(" max number test = FAIL ");
    }
    public void testMaxNumberForThree4 (){
        double number1 = 2;
        double number2 = 2;
        double number3 = 2;
        double resultMaxNumberForThree = new CalculatorService().maxNumberFromThree(number1, number2, number3);
        if (number1 == resultMaxNumberForThree ){
            System.out.println(" max number test = OK");
        }else System.out.println(" max number test = FAIL ");
    }
}
