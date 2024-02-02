package addHomeWork.add5;

public class Task21Demo {
    public static void main(String[] args) {

        Integer [][] array = new Integer[5][5];
        Task21 task21 = new Task21();

        task21.arrayRandom(array);
        task21.printArray(array);
        System.out.println(" summa number of array = " + task21.sumArrayNumber(array));
    }
}
