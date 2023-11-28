package lesson7.homework.dop.taskProg;
/*
**Цель**: Определить, является ли год високосным.
         Год является високосным, если он делится на 4 без остатка,
         и либо не делится на 100, либо делится на 400.

 */
public class Task4 {

    boolean leap = false;
    public boolean leapYear (int year){
        if (year % 4 ==0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leap = true;
                    return leap;
                }
                return leap;
            }
            leap = true;
        }
        return leap;
    }


}
