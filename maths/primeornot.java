package maths;
import java.util.*;

public class primeornot {

    public static boolean prime(int n){
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }         
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        System.out.println("is it prime true/false? "+prime(n));
    }
}

/*
 * in this code i just made a simple for loop till n/2 because after the mid way point all the pairs of numbers start to repeat so this saves us some time
 * and then i just checked if n divided by i will provide a remainder of 0
 * if no then false if yes then true simple
 */
