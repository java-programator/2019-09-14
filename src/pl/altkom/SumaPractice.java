package pl.altkom;

import java.util.Scanner;

public class SumaPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
//        while (scan.hasNext()) {
//            int num = scan.nextInt();
//            if(num == 0) {
//                break;
//            }
//            sum += num;
//        }
        int num;
        do {
            num = scan.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println(sum);
    }
}
