package pl.altkom.zad6_3;

import java.util.Random;

public class CopyTime {


    public static void main(String[] args) {

        int size = 15000000;
        int tab1[] = new int[size];

        Random random = new Random();

        for (int element : tab1) {
            element = random.nextInt(90) + 10;
        }

        int tab2[] = new int[size];

        long time1 = System.nanoTime();

        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[i];
        }

        long time2 = System.nanoTime();

        System.arraycopy(tab1, 0, tab2, 0, tab1.length);

        long time3 = System.nanoTime();


        System.out.println(time2 - time1);
        System.out.println(time3 - time2);

    }


}
