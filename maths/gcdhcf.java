/*
 * GCD GREATEST COMMON DIVISOR or HCF HIGHEST COMMON FACTORIAL
 * it means that the highest number that can divide two different numbers 
 * for 9 is 1 3 9
 * for 12 is 1 2 3 4 6 12 
 * so gcd will be 3 
 */

package maths;
import java.util.*;

public class gcdhcf {

    public static int gcd(int a, int b){
        int gcd=1;

        for(int i=Math.min(a,b); i>1; i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                return gcd;
            }
        }
        return gcd;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int n1 = sc.nextInt();
        System.out.print("enter the number: ");
        int n2 = sc.nextInt();
        System.out.print("gcd will be: "+gcd(n1, n2));
    }
}


/*
 * why are we using the minimum function? 
 * because if user enter a higher number it is just a waste of time if we traverse all the possibilites right?
 * rather than that we use min function to compare both numbers and just iterate till small number 
 * 
 * why are we going backwards?
 * because the question is asking highest common divisor so if we start from backwards i.e. higher number we can reach the gcd faster without many check 
 * after that we just set gcd to 1 and then return the answer
 * 
 * why inner if?
 * the if statement is actually checking if the i is dividing both numbers fully without any remainder, 
 * if yes only then the gcd will be set and the loop will be exited and the gcd is returned to main function to be printed
 */