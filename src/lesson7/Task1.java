package lesson7;

public class Task1 {
    public static void main(String[] args) {

        UserInput ui = new UserInput();
        System.out.println("Введите число");

        int n = ui.userInputInt();
        int x ;
        int z=0;
    for ( x = 0 ; x <= n ; x++ ) {
        if (x % 2 == 0) {
            z = z+x;
        }
        }
        System.out.println(z);

    }
}
