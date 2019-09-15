package pl.altkom.zad6_2;

public class StringReverse {


    public static void main(String[] args) {
        String test = "Ala ma kota!";
        String reversed = "";

        char [] array;
        for (int i = test.length()-1; i >= 0; i--){
            char z;
            if (Character.isUpperCase(test.charAt(i))){
                z = Character.toLowerCase(test.charAt(i));
            }
            else {
                z = Character.toUpperCase(test.charAt(i));
            }
            reversed += z;
        }

        System.out.println(reversed);

    }
}
