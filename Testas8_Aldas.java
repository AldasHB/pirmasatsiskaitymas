package org.example;

import java.util.Scanner;

public class Testas8_Aldas {
    public static void main(String[] args){
        isPalindrome();

    }
        static void isPalindrome(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a word, we'll check if it's a palindrome ");
            String a = sc.nextLine();
            StringBuilder str = new StringBuilder(a);
            String b = String.valueOf(str.reverse());
            if (a.equals(b)) {
                System.out.println(a + " backwards is "+ str +" It is a palindrome!");
            } else {
                System.out.println(a + " backwards is "+ str +" It is not a palindrome!");
            }
        }
}
