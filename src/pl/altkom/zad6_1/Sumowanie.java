package pl.altkom.zad6_1;
import java.util.Scanner;

public class Sumowanie {
    int suma = 0;

    public int Sumuj(int liczba){
        suma += liczba;
        return suma;
    }
    public Sumowanie(){
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sumowanie sumowanie = new Sumowanie();

        int liczba;

        do {
            liczba = scanner.nextInt();
            System.out.println(sumowanie.Sumuj(liczba));
        } while (liczba != 0);
    }
}
