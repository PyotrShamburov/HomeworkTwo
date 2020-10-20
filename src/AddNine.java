import java.util.Random;

public class AddNine {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(41);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 2; i < array.length; i+=2) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент c четным индексом: "+min);
    }
}
