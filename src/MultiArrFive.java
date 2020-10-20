import java.util.Random;
import java.util.Scanner;

public class MultiArrFive {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы (n x n): ");
        int n = in.nextInt();
        if (n < 2) {
            System.out.println("Неверные входные данные!");
        } else {
            int[][] array = new int[n][n];
            System.out.println("Матрица размером " + n + " x " + n + " :");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = rand.nextInt(51);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if ( i > j ){
                        int temp = array[i][j];
                        array[i][j] = array[j][i];
                        array[j][i] = temp;
                    }
                }
            }
            System.out.println("Транспонированная матрица: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
