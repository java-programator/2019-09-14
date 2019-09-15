package pl.altkom.zad6_1;

public class wiecznyKalendarz {
    static int dzienTyg(int d, int m, int y){
        int z;
        int c;
        if(m < 3){
            z = y + 1;
        } else {
            z = y;
        }
        if(m < 3){
            c = 0;
        } else {
            c = 2;
        }
        d = ((23*m/9) + d + 4 + y +(z/4) + (z/100) + (z/400) - c)%7;

        return d;
    }

    public static void main(String[] args) {
        System.out.println(dzienTyg(15,9,2019));
    }
}
