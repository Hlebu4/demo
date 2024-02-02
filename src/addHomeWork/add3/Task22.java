package addHomeWork.add3;
/*
Создайте класс FizzBuzz.
В классе FizzBuzz создайте метод со следующей сигнатурой:

class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)

 */
public class Task22 {

        public String detect( int number ) {
            if (number % 3 == 0 && number % 5 == 0 ) {
                return "FizzBuzz";
            } else if (number % 5 == 0 ) {
                return "Buzz";
            } else if (number % 3 == 0) {
                return "Fizz";
            } else return ""+number;
        }

    public static void main(String[] args) {

        UserInput ui = new UserInput();
        int number = ui.userInputInt(" enter number ");

        Task22 task22 = new Task22();
        System.out.println( task22.detect(number));
    }
}