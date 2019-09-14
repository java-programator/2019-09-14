package pl.altkom;

import java.util.Random;

public class SumaTablicy1 {

    public static void main(String[] args) {
        for(String i : args) {
            System.out.print(i);
        }
        System.out.println();
        int[] a = new int[5000000];
        Random rand = new Random();

        for(int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(90) + 10;
        }

        long t_a = System.nanoTime();

        int [] b = new int[a.length];
        for( int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        long t_b = System.nanoTime();

        int[] c = new int[a.length];

        System.arraycopy(a, 0, c, 0, a.length);

        long t_c = System.nanoTime();
        System.out.println(t_b - t_a);
        System.out.println(t_c - t_b);

    }
}
