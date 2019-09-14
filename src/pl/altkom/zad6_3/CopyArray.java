package pl.altkom.zad6_3;

import java.util.Arrays;
import java.util.Random;

public class CopyArray {

    public static void main(String[] args) {
        Random rand =  new Random();

        int arraySize = 5000000;
        int[] tab = new int[arraySize];

        for(int i=0; i<tab.length; i++){
            tab[i] = rand.nextInt(90) + 10;
        }

        long startTime = System.nanoTime();

        int[] newTab1 = new int[tab.length];
        for(int i=0; i<newTab1.length; i++){
            newTab1[i] = tab[i];
        }

        long endTime1 = System.nanoTime();

        int[] newTab2 = new int[tab.length];
        System.arraycopy(tab, 0, newTab2, 0, tab.length);

        long endTime2 = System.nanoTime();

        long diff1 = endTime1 - startTime;
        long diff2 = endTime2 - endTime1;

        System.out.println();

        if(diff1 > diff2){
            System.out.format("Dla wartości %s szybsze było kopiowanie \"na piechotę\"\n", arraySize);
        } else{
            System.out.format("Dla wartości %s szybsze było kopiowanie przez System.arraycopy\n", arraySize);
        }

    }

}
