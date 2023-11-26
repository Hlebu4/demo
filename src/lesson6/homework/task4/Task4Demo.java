package lesson6.homework.task4;

public class Task4Demo {
    public static void main(String[] args) {

    int h = 10;
    int n = 5;
    int m = 1;
    int x = 1;
    int sum = 0;

    while (x <= h){
        x = x + n;
        sum++;
        if (x < h){
            x = x - m ;
        }
    }
        System.out.println("Sum rising lift - " + sum);

    }
}
