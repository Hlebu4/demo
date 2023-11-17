package Lesson3.homework.task5;
/*
Задача 5.**
Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
Покажите это на конкретных примерах.
 */
public class lesson3Task5 {

    private int x = 2;
    private int y = 3;
    private int z;


    public void na2(int z){
        int resultNa2 = z % 2;
        System.out.println("Остаток от деления на 2 - " + resultNa2);
    }
    public void na3(int z){
        int resultNa3 =  z % 3;
        System.out.println("Остаток от деления на 3 - " + resultNa3);
    }
}
