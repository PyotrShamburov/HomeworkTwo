import java.util.Random;
import java.util.Scanner;

public class AddThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число C: ");
        int c = in.nextInt();
        if (c > 13 || c < 1){
            System.out.println("Неверные входные данные");
        }else {
            int[] array = new int[10];
            int sum = 0;
            int counter = 0;
            System.out.println("Массив из " + array.length + " случайных чисел: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(16);
                System.out.print(array[i] + " ");
                if (array[i] > c) {
                    sum += array[i];
                    ++counter;
                }
            }
            System.out.println();
            float res = (float) sum / counter;
            System.out.println("Среднее арифметическое чисел превосходящих число С : " + res);
        }
    }
}
