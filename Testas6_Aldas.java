import java.util.Scanner;



public class Testas6_Aldas {
    public static void main(String []args){
        calculateFactorial();
    }
    static void calculateFactorial(){
        int f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int x = Integer.parseInt(sc.nextLine());
        for(int i=1;i<=x;i++){
            f*= i;

        }
        System.out.println("Factorial (" +x+ ")! = " +f);
    }
}
