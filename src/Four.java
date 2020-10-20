import java.util.Random;

public class Four {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arrayFour = new int[20];
        for (int i = 0; i < arrayFour.length; i++) {
            arrayFour[i] = rand.nextInt(21);
        }
        System.out.println("Массив из "+arrayFour.length+" случайных чисел: ");
        for (int i = 0; i < arrayFour.length; i++) {
            System.out.print(arrayFour[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < arrayFour.length; i+=2) {
            arrayFour[i] = 0;
        }
        System.out.println("Массив с заменой на ноль значений с нечетным индексом: ");
        for (int i = 0; i < arrayFour.length; i++) {
            System.out.print(arrayFour[i] + " ");
        }
    }
}
