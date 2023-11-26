package lesson7.homework;
/*
**Цель**: С помощью цикла for/while написать программу,
- выводящую результат умножения числа n на все целые числа от 0 до n.
- **Пример**: Для числа 3, результат будет 0, 3, 6, 9.
 */
public class Task4 {
    public static void main(String[] args) {

        int n = 3;
        int x = 0;

        while (n >= x){
            int resultWhile = n * x;
            System.out.println("While :" + n + " * " + x + " = " + resultWhile);
            x++;
        }

        System.out.println("=========================");

        for (int i = 0; i <= n; i++) {
            int resultFor = n * i;
            System.out.println("For :" + n + " * " + i + " = " + resultFor);

        }
    }
}
