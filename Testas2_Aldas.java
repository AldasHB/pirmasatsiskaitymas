import java.util.Scanner;

import static java.util.Collections.reverse;

public class Testas2_Aldas {
    public static void main(String[] args) {
        stringOperations();

    }


    static void stringOperations() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String a = sc.nextLine();
        System.out.println(a.toLowerCase());
        StringBuilder str = new StringBuilder(a);
        System.out.println(str.reverse());
        String[] arr = a.split(" ");
        System.out.println(arr.length);
        if(arr[0].equals("Java")){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}