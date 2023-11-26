package lesson6.homework.task1;

/*
Cоздайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
Реализует логический метод canBuy, возвращающий true
** Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
Отобразите строку «Я могу купить еду, это ……» и значение.
 */
public class Task1Demo {
    public static void main(String[] args) {

        Task1Method result = new Task1Method();
        boolean result1= result.canBuyMethod();

        System.out.println(" Я могу купить еду, это - " +result1);


    }
}
