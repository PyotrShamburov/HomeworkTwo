import java.util.Random;
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число: ");
        int n = in.nextInt();
        if ( n < 4 ){
            System.out.println("Неверные входные данные!");
        }else {
            int[]array = new int[n];
            int nSecArray = 0;
            System.out.println("Массив из "+n+" случайных чисел: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(n+1);
                System.out.print(array[i] + " ");
                if ( array[i]%2 == 0 && array[i]>0){
                    ++nSecArray;
                }
            }
            System.out.println();
            int[]secArray = new int[nSecArray];
            int index = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2 == 0 && array[i]>0){
                    ++index;
                    for (int j=index; j < secArray.length; j++) {
                        secArray[j] = array[i];
                        break;
                    }
                }
            }
            System.out.println("Массив состоящий из четных чисел первого массива: ");
            for (int i = 0; i < secArray.length; i++) {
                System.out.print(secArray[i] + " ");
            }
        }
    }
}
