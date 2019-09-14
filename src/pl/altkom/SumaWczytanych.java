package pl.altkom;

import java.util.Scanner;

public class SumaWczytanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);

        int liczba = 0;
        int suma = 0;
        do {
            liczba = scanner.nextInt();
//            suma = suma + liczba;
            suma += liczba;
        } while (liczba != 0);
        System.out.println(suma);

    }
}
