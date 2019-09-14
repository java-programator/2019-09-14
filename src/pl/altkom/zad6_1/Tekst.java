package pl.altkom.zad6_1;

import java.util.Scanner;

public class Tekst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String zdanie = scan.nextLine();
        String noweZdanie = "";

        for (int i = zdanie.length() - 1; i >= 0; --i) {
            if (Character.isUpperCase(zdanie.charAt(i))) {
                noweZdanie += Character.toLowerCase(zdanie.charAt(i));

            } else if (Character.isLowerCase(zdanie.charAt(i))) {
                noweZdanie += Character.toUpperCase(zdanie.charAt(i));

            } else {
                noweZdanie += zdanie.charAt(i);

            }


        }
        System.out.println(noweZdanie);
    }
}