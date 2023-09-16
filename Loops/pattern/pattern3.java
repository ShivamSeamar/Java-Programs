package Loops.pattern;

import java.util.Scanner;

public class pattern3 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++){
            for(int str =1; str <=line ; str++){
                System.out.print(str);
            }
            System.out.println();
        }
        
    }
}


    // Take n = 5
// 1
// 12
// 123
// 1234
// 12345
