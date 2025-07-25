package maths;
import java.util.*;

public class divisors {

    public static void divisor(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println("divisors for "+n+"are : "+i);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        divisor(n);
    }
}

/*
 * this code is for nthn but just to return the numbers that can divide a number fully
 */
