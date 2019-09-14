package pl.altkom;

public class SumaTablicy1 {
    public static void main(String[] args) {
        int [] array = {1, 5, 7, 14, 6, 3, 9};

        int suma = 0;

        int index = 0;
        while (index < 7) {
            suma += array[index];
            index++;
        }

        for (int i = 0; i < array.length; i++) {
            suma += array[index];
        }

        System.out.println(suma);
    }
}
