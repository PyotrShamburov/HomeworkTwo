import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число элементов массива: ");
        int numOfElem = in.nextInt();
        if ( numOfElem < 2 ){
            System.out.println("Неверные входные данные!");
        }else {
            int[] arrNine = new int[numOfElem];
            for (int i = 0; i < arrNine.length; i++) {
                arrNine[i] = rand.nextInt(16);
            }
            System.out.println("Массив из "+numOfElem+" случайных чисел: ");
            for (int i = 0; i < arrNine.length; i++) {
                System.out.print(arrNine[i] + " ");
            }
            int div = numOfElem/2;
            int sum1= 0;
            int sum2 = 0;
            for (int i = 0; i < div; i++) {
                sum1 += arrNine[i];
            }
            for (int i = div; i < arrNine.length; i++) {
                sum2 += arrNine[i];
            }
            System.out.println();
            if (sum1> sum2){
                System.out.println("Первая половина массива больше");
            }else if (sum1<sum2){
                System.out.println("Вторая половина массива больше");
            } else {
                System.out.println("Первая и вторая половина массива равны");
            }



        }
    }

}
