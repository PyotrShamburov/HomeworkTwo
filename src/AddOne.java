import java.util.Random;

public class AddOne {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        int mul = 1;
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(16);
            if ( array[i]%3 == 0 && array[i] !=0){
                mul *= array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Произведение чисел кратных трем: "+mul);
}
}
