package pl.altkom;

public class zad6_4 {

    public static void main(String[] args) {
        /*
        for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }
         */

        // argumenty zmienia się w Edit Configuration
        for(String element : args){
            System.out.println(element);
        }
    }
}
