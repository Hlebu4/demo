package lesson7.homework;
/*
- **Цель**: Используя цикл for/while, написать программу, выводящую кубы чисел от 1 до n.
- **Пример**: Для числа n = 3, результат должен быть:
    - 1 в кубе = 1
    - 2 в кубе = 8
    - 3 в кубе = 27
 */
public class Task3 {
    public static void main(String[] args) {

        int n = 5;
        int x = 0;
        int z = 0;
        int y;


        while (n > x){
            x++;
            y = x * x * x;
            System.out.println(" while - " + x + " в кубе = " + y );
        }

        System.out.println("==========================================");


        for (int i = 0; i < n; i++) {
                z++;
                y = z * z * z;
                System.out.println(" for - " + z + " в кубе = " + y );
            }


    }
}
