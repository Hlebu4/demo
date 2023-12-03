package addHomeWork.add1;

public class Task1Demo {
    public static void main(String[] args) {
        Task1Service task1Service = new Task1Service();
        double firstNumber = task1Service.firstNumber();
        double secondNumber = task1Service.secondNumber();
        double multiplication = firstNumber * secondNumber;
        double division = firstNumber / secondNumber;
        double sum = firstNumber + secondNumber;
        double subtraction = firstNumber - secondNumber;

        System.out.println(" multiplication = " + multiplication);
        System.out.println(" division = " + division);
        System.out.println(" sum = " + sum);
        System.out.println(" subtraction = " + subtraction);
    }
}
