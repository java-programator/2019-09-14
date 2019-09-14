package pl.altkom.zad6_1;

public class SumaTablicy1 {
    public static void main(String[] args) {
        int [] array = {1,2,3,5,4,7,8,10};
        int suma = 0;

        for (int i = 0; i < array.length; i++ ){
            suma += array[i];
        }
        System.out.println(suma);
    }
}
