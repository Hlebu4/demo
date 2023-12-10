package lesson15.homework;

public class task4Demo {

            public static void main(String[] args) {
                Task4Service service = new Task4Service();
                int[][] matrix = service.array(9);

                System.out.println("Исходная матрица:");
                service.printMatrix(matrix);

                service.transposeMatrix(matrix);

                System.out.println();
                System.out.println("Транспонированная матрица:");
                service.printMatrix(matrix);
            }
}
