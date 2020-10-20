public class One {
    public static void main(String[] args) {
        int []array = new int[10];
        int add = 2;
        for (int i = 0; i < 10; i++) {
            array[i] = i + add;
            ++add;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            System.out.println();
        }
    }
}
