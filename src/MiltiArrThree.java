import java.util.Random;
import java.util.Scanner;

public class MiltiArrThree {
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
            int res1 = 1;
            int res2 = 1;
            for (int i = 0; i < array.length; i++) {
                res1 *= array[i][i];
                res2 *= array[i][n - 1 - i];
            }
            String comparison = (res1 > res2 )? "главной": "побочной";
            System.out.println("Произведение элементов "+comparison+" диагонали больше!");
        }
    }

}

