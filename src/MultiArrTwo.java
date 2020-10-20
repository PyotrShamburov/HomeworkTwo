import java.util.Random;
import java.util.Scanner;

public class MultiArrTwo {
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
            System.out.println("Нечетные элементы находящиеся под главной диагональю (включительно): ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i >= j && array[i][j]%2 == 1) {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
    }
}