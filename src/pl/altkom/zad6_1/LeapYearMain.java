package pl.altkom.zad6_1;

import java.util.Scanner;

public class LeapYearMain {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rok:");
        while (scanner.hasNext()) { /*ctrl + D - wyjscie z pętli*/
            int year = scanner.nextInt();
            System.out.println(isLeapYear(year));
            System.out.println("Podaj rok:");
        }
    }
}
