package pl.altkom.zad_suma_liczb_wpisanych;
import java.util.Scanner;


public class SumaLiczb {

    public static void main(String[] args) {
        int suma = 0;
        int liczba;

        Scanner scanner = new Scanner(System.in);

        do {
            liczba = scanner.nextInt();
            suma += liczba;
        } while (liczba != 0);

        System.out.println(suma);
    }
}
