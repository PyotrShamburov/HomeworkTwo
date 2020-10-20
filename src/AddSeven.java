import java.util.Random;
import java.util.Scanner;

public class AddSeven {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 29: ");
        int num = in.nextInt();
        int[] array = new int[30];
        if (num < 1 || num > 30){
            System.out.println("Неверные входные данные!");
        }else {
            System.out.println("Массив: ");
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(31);
                if ( array[i] == num){
                    ++count;
                }
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Количество повторений числа "+num+" равно: "+count);
        }
    }
}
