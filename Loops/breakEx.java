package Loops;

import java.util.Scanner;

public class breakEx {   //keep entering number till use enter a multiple of 10
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        do{
             System.out.println("Enter your number : ");
             int n = sc.nextInt();
             if(n % 10 == 0){
                break;
             }
              System.out.println(n);
        }while(true);
}
}