package ConditioalStatement;

import java.util.*;
public class elseif {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter the number :");
    int age = sc.nextInt();
       if(age>= 18){
        System.out.println("adult : drive,  vote");

       } 
       else if(age >13 && age <18){
        System.out.println("teenager");

       }
       else{
        System.out.println("Not adult");
       }

    }
    
}



    

