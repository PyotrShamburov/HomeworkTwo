public class Two {
    public static void main(String[] args) {
        int [] arrayTwo = new int[50];
        int count = 1;
        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = i + count;
            ++count;
        }
        System.out.println("В прямом порядке: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + " ");
        }
        System.out.println();
        System.out.println("В обратном порядке: ");
        for (int i = arrayTwo.length - 1 ; i>= 0; i--) {
            System.out.print(arrayTwo[i] + " ");
        }
    }
}
