package ConditioalStatement;
import java.util.*;
public class ternaryex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eter your marks : ");
        int marks = sc.nextInt();
        // int marks = 67;

        String marksheet = marks >=33 && marks<=100? "Congracsulation you are PASS" : " So Sorry you are FAIL or sumething went wrong " ;
        System.out.println(marksheet);

    }
    
}
