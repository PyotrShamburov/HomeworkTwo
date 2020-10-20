import java.util.Random;

public class Five {
    public static void main(String[] args) {
        Random rand = new Random();
        int []arrayOne = new int[5];
        int[] arrayTwo = new int[5];
        int firstCount = 0;
        int secCount = 0;
        System.out.println("Первый массив из "+arrayOne.length+" случайных чисел: ");
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = rand.nextInt(21);
            firstCount += arrayOne[i];
            System.out.print(arrayOne[i] + " ");
        }
        float averageOne = firstCount/ arrayOne.length;
        System.out.println();
        System.out.println("Второй массив из "+arrayTwo.length+" случайных чисел: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = rand.nextInt(21);
            secCount += arrayTwo[i];
            System.out.print(arrayTwo[i] + " ");
        }
        float averageTwo = secCount/ arrayTwo.length;
        System.out.println();
        if (averageOne > averageTwo){
            System.out.println("Среднее арифметическое первого массива больше!");
        }else if ( averageOne < averageTwo){
            System.out.println("Среднее арифметическое второго массива больше!");
        } else{
            System.out.println("Среднее арифметическое двух массивов равно!");
        }

    }
}
