package addHomeWork.add3.task12_13_14_15;

public class CalculatorService {

    public int sum (int number1 , int number2){
        return  number1 + number2;
    }

    public int  sub (int number1 , int number2){
        return number1 - number2;
    }

    public int  mul (int number1 , int number2){
        return number1 * number2;
    }

    public double  div (int number1 , int number2){
        return number1 / number2;
    }

    public boolean isEven (int number){
        if (number % 2 ==0){
            return true;
        }else return false;
    }

    public double maxNumberFromTwo (double number1, double number2){
        if (number1 > number2){
            return number1;
        }else if (number2 > number1){
            return number2;
        }else System.out.println(" number1 = number2");
        return number1;
    }

    public double maxNumberFromThree (double number1,double number2,double number3){
       double [] numbers = new double[] {number1,number2,number3};
       double maxNumber = number1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers [i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }



}



