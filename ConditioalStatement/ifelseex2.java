
package ConditioalStatement;

import java.util.*;
public class ifelseex2 {   //print if a number is Odd or Even 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number  = sc.nextInt();
         
        if (number % 2 == 0){
            System.out.println("Even Number ");

        }
        else{
            System.out.println("Odd number ");
        }


    }

    
}
