package Loops;

public class Loopex3 { // Reverse the given number 
    public static void main(String[] args){
        int n= 30062002;
        int rev =0;

        while(n>0){
            int lastDigit = n% 10;
            rev = (rev * 10) + lastDigit;
            n = n/10;
        }
        System.out.print(rev+ "");
    }

    
}
