import java.util.Random;

public class AddTen {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int maxId = 0;
        for (int i = 1; i < array.length; i++) {
            if ( array[i] > array[maxId]){
                maxId = i;
            }
        }
        System.out.println("Максимальный элемент: "+array[maxId]);
        int temp = array[0];
        array[0] = array[maxId];
        array[maxId] = temp;
        System.out.println("Преобразованный массив");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
