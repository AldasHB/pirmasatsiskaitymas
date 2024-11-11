import java.util.Arrays;
import java.util.Scanner;


public class Testas10_Aldas {
    public static void main(String [] args){
        analyzeInput();
    }

    static void analyzeInput(){
        int x;
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i=0;i<5;i++){
            x = Integer.parseInt(sc.next());
            arr[i]=x;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Which number do you want to find");
        int z = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.binarySearch(arr,z));
        System.out.println("Max number is " + arr[4]);
        System.out.println("Min number is " + arr[0]);
        int sum = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println("The sum is " + sum);
        System.out.println("Avg is " + sum/5);


    }
}
