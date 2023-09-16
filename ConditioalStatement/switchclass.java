package ConditioalStatement;
import java.util.*;

public class switchclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        // int n = 2;
        switch (n) {
            case 1:
                System.out.println("samosa1");
                break;
            case 2:
                System.out.println("samosa2");
                break;
            case 3:
                System.out.println("samosa3");
                break;
            case 4:
                System.out.println("samosa4");
                break;
            default :     System.out.println("wake up ");

        }

    }
}
