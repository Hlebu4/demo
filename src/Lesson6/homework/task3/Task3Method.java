package Lesson6.homework.task3;
/*
3. Задание №3
Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня.
Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов),
когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
Обьяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800,
далее оно должно выводиться на экран (для тех, кто понимает в секундах)
и на следующей строке (для тех кто не понимает) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

 */
public class Task3Method {


    public void time(int n) {
        int x = n / 3600;
        if ( x == 8) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 7) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 6) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 5) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 4) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 3) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 2) {
            System.out.println("Remaining " + x + " hours ");
            System.out.println("Remaining " + n + " seconds ");
        } else if (x == 1) {
            System.out.println("Remaining " + x + " hour ");
            System.out.println("Remaining " + n + " seconds ");
        } else {
            System.out.println("Remaining less hour ");
            System.out.println("Remaining " + n + " seconds ");
        }
    }
}