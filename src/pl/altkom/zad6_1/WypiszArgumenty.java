package pl.altkom.zad6_1;

public class WypiszArgumenty {
    public static void main(String[] args) {

        for(int i = 0; i< args.length; ++i){
            System.out.println(args[i]);
        }
        for(String o:args){
            System.out.println(o);
        }
    }
}
