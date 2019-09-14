package pl.altkom.zad6_2;

public class WordReverseMain {
    public static void main(String[] args) {


        String a = "p";
        String b = "a";
        String c = a + b; // "pa"

        String zdanie = "Ala ma kota!:)";

        char znak = zdanie.charAt(0);

        System.out.println(Character.isUpperCase(znak));
        System.out.println(Character.toLowerCase(znak));

        String result = "";

        for (int i = zdanie.length()-1; i >= 0; i--) {
            char z = zdanie.charAt(i);

            if (Character.isUpperCase(z)) {
                z = Character.toLowerCase(z);
            } else if (Character.isLowerCase(z)) {
                z = Character.toUpperCase(z);
            }

            result += z;
        }
        System.out.println(result);

    }
}
