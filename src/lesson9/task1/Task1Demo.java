package lesson9.task1;

public class Task1Demo {
    public static void main(String[] args) {

        Task1 sumCal = new Task1();

        double pizza1= sumCal.areaPizza(12);
        double pizza2= sumCal.areaPizza(14);

        double sum = pizza1 - pizza2;
        System.out.println(sum);
    }
}
