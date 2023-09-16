package ConditioalStatement;

public class ternary {   //number is odd or even
    public static void main(String[] args){
        int number = 4;

        //ternary operator 
        String type = ((number % 2) ==  0)? "The number is Even" : "The number is odd";
        System.out.println(type);

    }
}
