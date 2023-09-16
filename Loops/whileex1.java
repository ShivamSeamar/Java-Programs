package Loops;

import java.util.*;
public class whileex1 {     //print number from 1 to n 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 0;
        while(i<=n){
            System.out.print(i + " ");
            i++;


        }

        System.out.println("end of loop");


    }
    
}
