/*<.........Input in java ....>
1. next();
2. nextLine();
3. nextInt();
4. nextFloat();
5. nextDouble()
6. nextBoolean();
7. nextshort();
8. nextLong();
9. nextByte();
10 .next().charAt(0)*/

import java.util.*; // import the java inbild class until and use scanner class with any object such as sc or s or etc 
public class input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();//if space is found then exit imeadatly 
        String l = sc.nextLine();//red the space 
        int i = sc.nextInt();
        byte b = sc.nextByte();
        float f = sc.nextFloat();
        boolean n = sc.nextBoolean();

        System.out.println(input);
        System.out.println(l);
        System.out.println(i);
        System.out.println(b);
        System.out.println(f);
        System.out.println(n);

    }
}
