package homework.dop;

import lesson7.UserInput;

/*
Task 3
- **Цель**: Программа запрашивает у пользователя слово "hello". Если слово введено верно,
программа благодарит и завершает работу. В противном случае запрашивает ввести слово снова.
- **Опционально**: Считать количество попыток, требуемых для введения правильного слова.
По окончанию вывести это число.

 */
public class Task4 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

        boolean input = true;
        while (input){
            System.out.println(" Plies Enter hello ");
            String hello = ui.userInputText();
            while (hello.equals("hello"));{
                input = false;
            }
        }


    }
}
