package Loops.pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number  of Line:");
        int n = sc.nextInt();
        char ch = 'A';
        for(int line = 1; line <= n; line++){
            for(int str =1; str <=line ; str++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
    }
    
}

/*Enter the  number  of Line:
6
A
B C
D E F
G H I J
K L M N O
P Q R S T U*/
