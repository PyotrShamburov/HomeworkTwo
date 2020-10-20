import java.util.Random;

public class Eight {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] firstArr = new int[10];
        int[] secArr = new int[10];
        float [] thirdArr = new float[10];
        int count = 0;
        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = rand.nextInt(11);
            secArr[i] = rand.nextInt(11);
            if ( secArr[i] != 0 ){
                thirdArr[i] = (float)firstArr[i]/secArr[i];
                if ((float)firstArr[i]%secArr[i] == 0 && firstArr[i] != 0){
                    ++count;
                }
            } else {
                thirdArr[i] = 0;
            }
        }
        System.out.println("Первый массив: ");
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        System.out.println("Второй массив: ");
        for (int i = 0; i < secArr.length; i++) {
            System.out.print(secArr[i] + " ");
        }
        System.out.println();
        System.out.println("Третий массив: ");
        for (int i = 0; i < thirdArr.length; i++) {
            System.out.print(thirdArr[i] + " ");
        }
        System.out.println();
        System.out.println("Количество целых чисел третьего массива: " + count);


        }

    }

