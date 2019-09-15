package pl.altkom.zad6_6;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Wielokrotnosci {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter end number: ");
        int end = scanner.nextInt();

        System.out.println("How many dividers to be considered?: ");
        int size = scanner.nextInt();

        System.out.println("Enter desired dividers");


        for (int j = 1; j <= size; j++ ){
            int counter = 0;
            int element = 0;
            element = scanner.nextInt();
            for (int i = start; i <= end; i++){
                if (i % element == 0) {
                    counter++;
                }
            }
            System.out.println("There is "+counter+" numbers divisible by "+element+" without decimal part");
        }








    }


}
