package lesson2;

public class homework0811{
    public static void main(String[] args) {

        char xChar = 'g';
        byte xByte = 127;
        short xShort = 32767;
        int xInt = 333333;
        long xLong = 44444444;
        float xFloat = 555.5555f;
        double xDouble = 6666.66666;

        System.out.println("xChar = " + xChar);
        System.out.println("xByte = " + xByte);
        System.out.println("xShort = " + xShort);
        System.out.println("xInt = " + xInt);
        System.out.println("xLong = " + xLong);
        System.out.println("xFloat = " + xFloat);
        System.out.println("xDouble = " + xDouble);

        System.out.println("====================");

        System.out.println("xByte = " + xByte + "; xShort = " + xShort + "; xInt = " + xInt + "; xLong = " + xLong + "; xFloat = " + xFloat + "; xDouble = " +xDouble);

        System.out.println("=====================");

        System.out.println("dano: 452");

        int number = 452 ;

        int x =  number % 10 ;
        int y = number % 100 / 10;
        int z = number / 100;

        System.out.println("x = " + z);
        System.out.println("y = " + y);
        System.out.println("z = " + x);


    }

}
