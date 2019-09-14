package pl.altkom.zad6_1;
import java.util.Date;
import java.util.Random;

public class PomiarCzasu {
    public static void main(String[] args) {
        int tab1[] = new int [100000];
        int tab2[] = new int [tab1.length];
        Random random = new Random();

        for (int i=0; i<tab1.length;++i){
            tab1[i] = random.nextInt(90)+10;
        }
        long t1 = System.currentTimeMillis();
        for (int i=0; i<tab1.length;++i){
            tab2[i] = tab2[i] ;
        }
        long t2 = System.currentTimeMillis();

        System.arraycopy(tab1,0,tab2,0,tab1.length);
        long t3 = System.currentTimeMillis();

        System.out.println(String.format("Kopiowanie w pętli trwa %d milisekund",t2-t1));
        System.out.println(String.format("Kopiowanie Systemowe trwa %d milisekund",t3-t2));
    }
}
