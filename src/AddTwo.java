import java.util.Random;

public class AddTwo {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        int sum = 0;
        int counter = 0;
        System.out.println("Массив из "+array.length+" случайных чисел: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(16);
            System.out.print(array[i]+" ");
            if ( i%2 == 1){
                sum += array[i];
                ++counter;
            }
        }
        float res = (float) sum/counter;
        System.out.println();
        System.out.println("Среднее арифметическое чисел с нечетным индексом: "+res);
    }
}
