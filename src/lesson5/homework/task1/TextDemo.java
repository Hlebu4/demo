package homework.task1;

import lesson5.homework.task1.Text;

/*
    1. Задание №1
   1 Создайте строку через new - I study Basic Java!
   2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
   3 Распечатать последний символ строки. Используем метод String.charAt().
   4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
   5 Заменить все символы “а” на “о”.
   6 Преобразуйте строку к верхнему регистру.
   7 Преобразуйте строку к нижнему регистру.
   8 Вырезать строку Java c помощью метода String.substring().
     */
public class TextDemo {

    public static void main(String[] args) {

        lesson5.homework.task1.Text text1 = new Text();
        text1.textMetod();

        String line = "I study Basic Java!";

        int lineLength = line.length();
        System.out.println("Длина строки - " + lineLength);

        char lastSymbo = line.charAt(18);
        System.out.println("Последний символ - " + lastSymbo);

        String checkJava = "Java";
        boolean resultCheckJava = line.contains(checkJava);
        System.out.println("входит ли в строку символы Java - " + resultCheckJava);

        String checkJava2 = "Java ";
        boolean resultCheckJava2 = line.contains(checkJava2);
        System.out.println("входит ли в строку символы Java_(пробел) - " + resultCheckJava2);

        String replaceText = line.replace("a","o");
        System.out.println("Заменили все а на о - " + replaceText);

        String toUpper = line.toUpperCase();
        System.out.println("Вся строка заглавными - " + toUpper);

        String toLower = line.toLowerCase();
        System.out.println("Вся строка маленькими буквами - " + toLower);
        System.out.println("Тоже самое без новой переменной - " + line.toLowerCase() );

        System.out.println("Первый индекс Java - " + line.indexOf("Java"));
        System.out.println("Последний индекс Java - " + line.lastIndexOf("a"));

        System.out.println("Вырезали из строки Java - " + line.substring(14,18));
    }
}
