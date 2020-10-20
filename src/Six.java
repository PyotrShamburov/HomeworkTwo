import java.util.Random;

public class Six {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arraySix = new int[4];
        System.out.println("Массив из "+arraySix.length+" случайных чисел: ");
        for (int i = 0; i < arraySix.length; i++) {
            arraySix[i] = rand.nextInt(11);
            System.out.print(arraySix[i]+" ");
        }
        System.out.println();
        int counter = 0;
        for (int i = 0; i < arraySix.length -1; i++) {
                if ( arraySix[i] < arraySix[i + 1]){
                    ++counter;
                }
        }
        System.out.println(counter);
        if ( counter == (arraySix.length - 1)){
            System.out.println("Строго возврастающая последовательность!");
        }else {
            System.out.println("Не строго возврастающая последовательность!");
        }

    }
}
