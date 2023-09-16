package Loops;
import java.util.*;
public class forex2 { // Print of a number 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        while(n>0){
            int lastnumber =n%10;
            System.out.print(lastnumber+" ");
            n=n/10;
        }

    }
    
}
