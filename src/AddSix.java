import java.util.Random;

public class AddSix {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int coupleCount = 0;

        for (int i = 0; i < array.length-1; i++) {
            int min = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ++coupleCount;
                }
            }
        }
        if (coupleCount == 0){
            System.out.println("Все элементы массива различны");
        }else {
            System.out.println("Есть повторения элементов");
        }
    }
}
