package addHomeWork.add3;
/*
Написать класс для определения високосный год или нет.

class LeapYear {

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.
 */
public class Task23 {

    public boolean leapYear (int year) {
        if (year % 4 == 0) {
            if (year % 100  != 0){
                return true;
            } else if (year % 400 == 0 ) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Task23 task23 = new Task23();
        UserInput ui = new UserInput();
        System.out.println(task23.leapYear(ui.userInputInt("enter year")));

    }
}
