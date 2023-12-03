package addHomeWork.add1;
/*
Напишите программу, которая запрашивает у пользователя
радиус круга (вещественное число) и печатает на консоль периметр и площадь круга.
 */
public class Task4 {
    public static void main(String[] args) {

        Task4Service task4Service = new Task4Service();
        double number = task4Service.scan();
        task4Service.perimeter(number);
        task4Service.area(number);
    }
}
