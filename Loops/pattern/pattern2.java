package Loops.pattern;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number :");
        int n = sc.nextInt();
        for(int line = 1; line <= n; line++){
            for(int str =1; str <= n-line +1; str++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}


// *****
// ****
// ***
// **
// *