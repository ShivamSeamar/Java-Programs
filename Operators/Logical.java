//Logical operator 1. Logical And (&&),2. Logical or (||), 3. Logical Not (!)

package Operators;

public class Logical {
    public static void main(String[] args){  
        int a=10;  
        int b=5;  
        int c=20;  
       /* System.out.println(a<b&&a++<c);//false && true = false  
        System.out.println(a);//10 because second condition is not checked  
        System.out.println(a<b&a++<c);//false && true = false  
        System.out.println(a);//11 because second condition is checked  */

               //Java OR Operator Example: Logical || and Bitwise |

                
               System.out.println(a>b||a<c);//true || true = true  
               System.out.println(a>b|a<c);//true | true = true  
               //|| vs |  
               System.out.println(a>b||a++<c);//true || true = true  
               System.out.println(a);//10 because second condition is not checked  
               System.out.println(a>b|a++<c);//true | true = true  
               System.out.println(a);//11 because second condition is checked 

              /*  //Logical NOt (!)
               System.out.println( !(2>3));//true*/
    }
}
    

