package lesson15.homework;

import java.util.Arrays;

/*
4. Напишите программу, которая будет транспонировать
заданную квадратную матрицу без использования дополнительного массива.
Напоминаем, что такое транспонирование матрицы.
Транспонированная матрица - это матрица, полученная из исходной
матрицы путем замены строк на столбцы.
 */
public class Task4Service {

    public int [][] array (int length){
        int [][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix [i][j] = j + 1;
            }
        }
        return matrix;
    }

    public void transposeMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // не знал как распечатать, подсмотрел...
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


}