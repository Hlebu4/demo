package lesson5.homework.task3;
/*
 3. Задание №3
Напешите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
пиццы содержит 40 калорий.
 */
public class PizzaDemo {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();

        pizza1.setX(24);
        double areaPizza1 = pizza1.area();

        Pizza pizza2 = new Pizza();
        pizza2.setX(28);
        double areaPizza2 = pizza2.area();

        double result = Math.floor(areaPizza2 - areaPizza1);
        System.out.println(result + " - Лишних калорий во второй пицце");








    }
}
