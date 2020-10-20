import java.util.Random;

public class Three {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arrayThree = new int[15];
        for (int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = rand.nextInt(100);
        }
        System.out.println("Массив из "+arrayThree.length+ " случайных чисел: ");
        int counter = 0;
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i] +" ");
        }
        System.out.println();
        for (int i = 0; i < arrayThree.length; i++) {
            if ( arrayThree[i]%2 == 0 ){
                ++counter;
            }
        }
        System.out.println("Количество четных чисел равно: "+counter);
    }
}
