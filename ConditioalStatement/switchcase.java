package ConditioalStatement;

import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the operation to be want  to perform :like + , _ , * , / ,%  : ");
        System.out.println(" Enter 'v' find volume of cube : ");
        System.out.println(" Enter 'i' for  Program to convert ASCI value to String : ");
        System.out.println(" Enter 'j' for  Program to convert String  value to ASCI :");
        System.out.println(" Enter 'f' for factorial : ");
        System.out.println(" Enter 's' for sum of n number : ");
        System.out.println(" Enter 'h' for calculate  hcm or lcm : ");
        System.out.println(" Enter 'Y' for check year is leap year  or not : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Enter the 1st number : ");

                int sum1 = sc.nextInt();
                System.out.println("Enter the 2nd  number : ");
                int sum2 = sc.nextInt();
                System.out.println("Answer is = " + (sum1 + sum2));
                break;
            case '-':
                System.out.println("Enter the 1st number : ");

                int min1 = sc.nextInt();
                System.out.println("Enter the 2nd  number : ");
                int min2 = sc.nextInt();
                System.out.println("Answer is = " + (min1 - min2));
                break;
            case '*':
                System.out.println("Enter the 1st number : ");

                int mul1 = sc.nextInt();
                System.out.println("Enter the 2nd  number : ");
                int mul2 = sc.nextInt();
                System.out.println("Answer is = " + (mul1 * mul2));
                break;
            case '/':
                System.out.println("Enter the 1st number : ");

                int div1 = sc.nextInt();
                System.out.println("Enter the 2nd  number : ");
                int div2 = sc.nextInt();
                System.out.println("Answer is = " + (div1 / div2));
                break;
            case '%':
                System.out.println("Enter the 1st number : ");

                int mod1 = sc.nextInt();
                System.out.println("Enter the 2nd  number : ");
                int mod2 = sc.nextInt();
                System.out.println("Answer is = " + (mod1 % mod2));
                break;
            case 'f':
                int i, fact = 1;
                System.out.println("Entrr the number for factorial :");
                int number = sc.nextInt();// It is the number to calculate factorial.
                for (i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + number + " is: " + fact);
                break;
            case 's':
                int j, sum = 0;
                System.out.println("Entrr the number for sum of n natural number   :");
                int num = sc.nextInt();// It is the number to calculate factorial.
                for (j = 1; j <= num; j++) {
                    sum = sum + j;
                }
                System.out.println("sum  of " + num + " is: " + sum);
                break;
            case 'h':
                System.out.println("Enter the two number for HCF AND LCM :");
                int c, d, t, hcf, lcm;
                int x = sc.nextInt();
                int y = sc.nextInt();

                c = x;
                d = y;
                while (d != 0) {
                    t = d;
                    d = c % d;
                    c = t;
                }
                hcf = c;
                lcm = (x * y) / hcf;
                System.out.print("HCF and LCM of : " + x + " and " + y + " is :\n");
                System.out.print("HCF = " + hcf);
                System.out.print("\nLCM = " + lcm);
                break;
            case 'v':
                System.out.println("Enter the number for find volume of cube : ");

                int side = sc.nextInt();
                float volume = side * side * side;
                System.out.println("Volume of Cube :" + volume);
                break;
            case 'i':
                System.out.println(" Enter the number  for Program to convert ASCI value to String");
                char e;
                int g = sc.nextInt();
                for (int k = g; k < 200; k++) {
                    e = (char) k;
                    System.out.println(k + " = " + e);

                }
                break;
            case 'j':
                System.out.println(" Enter the number for  convert String  value to ASCI");

                char ch = sc.next().charAt(0);
                int ascii = ch;
                // You can also cast char to int
                /*
                 * int castAscii = (int) ch;
                 * 
                 * System.out.println("The ASCII value of " + ch + " is: " +castAscii );
                 */
                System.out.println("The ASCII value of " + ch + " is: " + ascii);

                break;
            case 'y':
                System.out.print("Input the year: ");
                int year = sc.nextInt();
                boolean A = (year % 4) == 0;
                boolean B = (year % 100) != 0;
                boolean C = ((year % 100 == 0) && (year % 400 == 0));
                if (A && (B || C)) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }

                break;
            default:
                System.out.println("Calculator is not Advance");

        }

    }

}
