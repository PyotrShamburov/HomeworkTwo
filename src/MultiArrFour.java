import java.util.Random;
import java.util.Scanner;

public class MultiArrFour {
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
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - i -1; j++) {
                    if ( array[i][j]%2==0 ){
                        sum += array[i][j];
                    }
                }
            }
            System.out.println("Сумма четных элементов над побочной диагональю (не включительно): "+sum);
        }
    }
}
