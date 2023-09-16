package ConditioalStatement;

import java.util.*;

public class elseifex2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number A = : ");
        int A = sc.nextInt();
        System.out.println("Enter the seccond number B = : ");
        int B = sc.nextInt();
        System.out.println("Enter the theird  number C = : ");
        int C = sc.nextInt();
        // int A= 1,B =3, C = 6;
        if ((A >= B) && (A >= C)) {
            System.out.println("largest is A");
        } else if (B >= C) {
            System.out.println("largest is B");
        } else {
            System.out.println("largest is C ");
        }

    }
}
