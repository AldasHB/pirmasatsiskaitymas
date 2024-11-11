package org.example;

import java.util.Scanner;

public class Testas7_Aldas {
    public static void main(String [] args){
        calculate();
    }

    static void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers ");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Type add if you want to add up the numbers");
        String c = sc.nextLine();
        if(c.equals("add")){
            System.out.println(a+b);
        }
        else{
            System.out.println(Math.abs(a-b));
        }
    }

}
