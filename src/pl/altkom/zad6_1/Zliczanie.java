package pl.altkom.zad6_1;

public class Zliczanie {
    public static void main(String[] args) {
        int podzielniki[] = {7, 13, 29, 43};
        int counter[] = new int [podzielniki.length];
        int start = 1234;
        int koniec = 2345;

        for (int j = 0; j < podzielniki.length; j++) {
            for (int i = start; i <= koniec; ++i) {
                if (i % podzielniki[j] == 0) {
                    counter[j]++;
                }
            }
        }
        System.out.println(counter[0]);

    }
}
