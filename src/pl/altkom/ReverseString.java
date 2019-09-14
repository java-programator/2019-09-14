package pl.altkom;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //String userInput = scan.nextLine();

        String userInput = "Ala ma kota!:)";
        String reverseString = "";
        for(int i=userInput.length()-1; i>=0; i--){
            char a = userInput.charAt(i);
            if(Character.isUpperCase(a)){
                a = Character.toLowerCase(a);
            } else if(Character.isLowerCase(a)){
                a = Character.toUpperCase(a);
            }
            // !!! można dodawać char do String i wyjdzie String
            reverseString += a;
        }
        System.out.println(reverseString);
    }

}
