import java.util.Scanner;

public class Testas1_Aldas {
    public static void main(String[] args){
        logicalOperations();
    }

    static void logicalOperations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        if(a%2==0 && b%2==0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(a>=0||b>=0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(a>b && a%5==0 && b%5==0){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
