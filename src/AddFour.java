import java.util.Random;

public class AddFour {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(61);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min && array[i]%2 == 1){
                min = array[i];
            }
        }
        System.out.println("Минимальный нечетный элемент: "+min);

    }
}
