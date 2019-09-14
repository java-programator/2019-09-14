package pl.altkom;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        Random random = new Random();
        int dzienTygodnia = random.nextInt(7);

        if (dzienTygodnia == 0) {
            System.out.println("Poniedziałek");
        } else if (dzienTygodnia == 1) {
            System.out.println("Wtorek");
        } else if (dzienTygodnia == 2) {
            System.out.println("Środa");
        } else if (dzienTygodnia == 3) {
            System.out.println("Czwartek");
        } else if (dzienTygodnia == 4) {
            System.out.println("Piątek");
        } else if (dzienTygodnia == 5) {
            System.out.println("Sobota");
        } else if (dzienTygodnia == 6) {
            System.out.println("Niedziela");
        }

        switch (dzienTygodnia) {
            case 0:
                System.out.println("Poniedziałek");
                break;
            case 1:
                System.out.println("Wtorek");
                break;
            case 2:
                System.out.println("Środa");
                break;
            case 3:
                System.out.println("Czwartek");
                break;
            case 4:
                System.out.println("Piątek");
                break;
            case 5:
                System.out.println("Sobota");
                break;
            case 6:
                System.out.println("Niedziela");
                break;

        }
    }
}
