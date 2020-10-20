import java.util.Random;

public class Seven {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arraySeven = new int[12];
        System.out.println("Массив из "+arraySeven.length+" случайных чисел: ");
        for (int i = 0; i < arraySeven.length; i++) {
            arraySeven[i] = rand.nextInt(16);
            System.out.print(arraySeven[i] + " ");
        }
        System.out.println();
        int max= arraySeven[0];
        int maxId=0;
        for (int i = 1; i < arraySeven.length; i++) {
            if ( arraySeven[i] > max ){
                max = arraySeven[i];
                maxId = i;
            }
        }
        System.out.println("Наибольшее число: "+max + " .Его индекс: "+ maxId);
    }
}
