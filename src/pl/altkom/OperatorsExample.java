package pl.altkom;

public class OperatorsExample {

    static boolean isValid(int x) {
        System.out.println("HAHAHAHAHAHAHAH");
        return true;
    }

    public static void main(String[] args) {
        int i = 5;
        System.out.println(i++);
        System.out.println(++i);

        if (i == 7 | isValid(i)) {
            System.out.println("Jestem w ifie");
        } else {
            System.out.println("Jestem w else");
        }

        byte b = 13;
        byte c = 14;

        System.out.println(b & c);
        System.out.println(b | c);
        System.out.println(b ^ c);
        System.out.println(~b);

        byte d = 1;

        while (true) {break;}
        System.out.println(d << 5);

    }
}
