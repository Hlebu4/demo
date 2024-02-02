package lesson30.homework;

import java.util.*;

/*
5. Написать метод, который принимает на вход два списка (LinkedList) и возвращает новый список
состоящий только из элементов, которые есть в обоих списках.
 */
public class Task5 {

    public LinkedList<Integer> sameElement (LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> myNewList = new LinkedList<>();
        for (Integer number : list1)
            for (Integer number2 : list2){
                if (Objects.equals(number, number2)){
                    myNewList.add(number);
                }
            }
        HashSet<Integer> uniqueNumbers = new HashSet<>(myNewList);
        return new LinkedList<>(uniqueNumbers);
    }

    public static void main(String[] args) {
        Task5 task5 = new Task5();

        LinkedList<Integer>list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        list1.add(4);
        System.out.println(list1);

        LinkedList<Integer>list2 = new LinkedList<>();
        list2.add(5);
        list2.add(1);
        list2.add(6);
        list2.add(3);
        list2.add(4);
        list2.add(4);
        System.out.println(list2);


        System.out.println(task5.sameElement(list1,list2));

    }


}
