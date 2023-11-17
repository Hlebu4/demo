package Lesson3.homework.task1;

/*
**Задача 1.**
Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки:
```console
"Меня зовут ..."
"Мне ... лет"
"Я из ..."
```
**На месте многоточий должны использоваться данные, которые предварительно были записаны в переменные!**
 */
public class Task1 {
    public static void main(String[] args) {



        String name = "Ivan", from = "Sewastopol" ;
        int ege = 25 ;


        System.out.println("My name is " + name);
        System.out.println("I am " + ege + " years old");
        System.out.println("I am from " + from);



    }
}
