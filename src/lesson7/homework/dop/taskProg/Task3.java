package lesson7.homework.dop.taskProg;
/*
    **Цель**: Склонение слова "корова" в зависимости от числа n.
- **Входные данные**: Целое положительное число n (n ≤ 10).
- **Выходные данные**: Фраза "На лугу пасется n коров(а/ы)".
     */
public class Task3 {
    public void declination(int quantity) {
        if (quantity > 10){
            return;
        }

        if (quantity >= 5) {
            String cow = "";
            System.out.println(" на лугу пасётся " + quantity + " коров" + cow);
        } else if (quantity > 1) {
            String cow = "ы";
            System.out.println(" на лугу пасётся " + quantity + " коров" + cow);
        } else if (quantity == 1) {
            String cow = "а";
            System.out.println(" на лугу пасётся " + quantity + " коров" + cow);
        }

    }
}


