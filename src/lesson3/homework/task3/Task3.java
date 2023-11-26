package lesson3.homework.task3;
/*
**Задача 3.**
Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
Отдельно выведите на экран сумму скидки от этой покупки.
 */
public class Task3 {

    public int a;
    public int b;
    public int discount;

    public void sumWithDiscount(){
        int sumWithDiscount = a + b - discount;
        System.out.println("Sum with discount = " + sumWithDiscount + " Discount = " + discount);
    }


}
