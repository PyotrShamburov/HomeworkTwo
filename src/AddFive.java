import java.util.Random;

public class AddFive {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(50);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Измененный массив: ");
        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
