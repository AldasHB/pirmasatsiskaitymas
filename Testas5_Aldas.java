import java.util.Scanner;

public class Testas5_Aldas {
    public static void main(String [] args){
        printNumbers();
    }

    static void printNumbers(){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=1; i<=n; i++){
            sum+= i;
            System.out.print(i+ " ");
        }
        for(int i=n;i<=1;i--){
            System.out.print(i+ " ");
        }
        System.out.print("The sum is " + sum);
    }
}
