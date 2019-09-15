package pl.altkom.tablica_intow;

public class SumaTablicy {
    public static void main(String[] args) {
        int [] array = {1, 5, 7, 14, 6, 3, 9};

        int index = array.length-1;
        int sum = 0;

//        /* z petla while*/
//        while (index >= 0){
//            sum += array[index];
//            index -= 1;
//        }

        /* z petla for*/
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

//        System.out.println(licznik);
        System.out.println(sum);
    }
}
