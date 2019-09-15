package pl.altkom.zad6_1;

public class liczbyPierwsze {
    static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start = 123;
        int koniec = 234;
        int counter = 0;

        for (int i = start; i <= koniec; ++i) {
            if (isPrime(i)) {
                counter++;
            }
        }
        System.out.println(counter);

        counter = 0;
        outer:
        for (int liczba = start; liczba < koniec; liczba++) {
            for (int podzielnik = 2; podzielnik * podzielnik <= liczba; podzielnik++) {
                if (liczba % podzielnik == 0) {
                    continue outer;
                }
            }
            counter++;
        }

    }
}
