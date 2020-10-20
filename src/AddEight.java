import java.util.Random;

public class AddEight {
    public static void main(String[] args) {
        Random rand = new Random();
        int[]array = new int[20];
        int[]arrayCopy = new int[array.length];
        System.out.println("Массив на "+array.length+" случайных элементов: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21);
            arrayCopy[i] = array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayCopy.length - 1; i++) {
            for (int j = 0; j < arrayCopy.length - i - 1; j++) {
                if ( arrayCopy[j] > arrayCopy[j+1]){
                    int temp = arrayCopy[j];
                    arrayCopy[j] = arrayCopy[j+1];
                    arrayCopy[j+1] = temp;
                }
            }
        }
        /*for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();*/
        boolean elem = true;
        while (elem){
            for (int i = arrayCopy.length-1; i>=0 ; i--) {
                if ( arrayCopy[i] > arrayCopy[i - 1]){
                    System.out.println("Второй по величине элемент массива: "+arrayCopy[i-1]);
                    elem = false;
                    break;
                }
            }
        }
    }
}
