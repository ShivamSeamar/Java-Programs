package Loops;

import java.util.*;

public class whileloops {       //print hello world

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 0;
        
        while(i<n){
            System.out.println("Shivam Seamar");
            i++;
        }
        System.out.println("helloworld print "   +  n +" time");
    }
}