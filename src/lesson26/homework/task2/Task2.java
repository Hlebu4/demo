package lesson26.homework.task2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/*
    Написать метод для проверки правильного количества скобок.
    Проверить на следующих последовательностях:
    String text1 = "()";
    String text2 = "([{}])";
    String text3 = "()()()";
    String text4 = "({[]])";
    String text5 = ")([{({[{{[[(( ))]]}}]}])";
 */
public class Task2 {

    public boolean verificationText (String text){
        ArrayDeque<Character> textDeque = new ArrayDeque<>();
        for (char bracket : text.toCharArray()){
            textDeque.add(bracket);
        }
        System.out.println(textDeque);

        while (!textDeque.isEmpty()){
            char firstBracket = textDeque.pollFirst();
            char lastBracket = textDeque.pollLast();
            if (firstBracket == '(' && lastBracket ==')' || firstBracket ==')' && lastBracket == '('
                || firstBracket == '{' && lastBracket =='}' || firstBracket =='}' && lastBracket == '{'
                || firstBracket == '[' && lastBracket ==']' || firstBracket ==']' && lastBracket == '['){
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Task2 task2 = new Task2();

        String text1 = "()";
        String text2 = "([{}])";
        String text3 = "()()()";
        String text4 = "({[]])";
        String text5 = ")([{({[{{[[(( ))]]}}]}])";

        System.out.println("text 1 " + task2.verificationText(text1));
        System.out.println("text 2 " + task2.verificationText(text2));
        System.out.println("text 3 " + task2.verificationText(text3));
        System.out.println("text 4 " + task2.verificationText(text4));
        System.out.println("text 5 " + task2.verificationText(text5));

    }
}
