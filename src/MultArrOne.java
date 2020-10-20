import java.util.Random;
import java.util.Scanner;

public class MultArrOne {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы (n x n): ");
        int arrSize = in.nextInt();
        if (arrSize < 2) {
            System.out.println("Неверные входные данные!");
        }else{
            int[][]array = new int[arrSize][arrSize];
            System.out.println("Матрица размером "+arrSize+" x "+arrSize+" : ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = rand.nextInt(51);
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                    if ( array[i][i]%2 == 0 && array[i][i] != 0){
                        sum += array[i][i];
                    }
            }
            System.out.println("Сумма четных элементов главной диагонали: "+sum);
        }
    }
}
