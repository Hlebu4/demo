package lesson9.task1;
/*
*
 3. Задание №3
Напешите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр
пиццы содержит 40 калорий.
 */

public class Task1 {

     public double areaPizza (int sizePizza){
         double area = Math.PI * sizePizza * sizePizza ;
         double sumCal = area * 40;
         return sumCal;
     }


}


