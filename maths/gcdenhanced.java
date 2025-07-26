package maths;
import java.util.*;

public class gcdenhanced {
        public static int gcd(int a, int b){
        int gcd=1;

        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
        }
        if(a==0) gcd=b;
        else gcd=a;
        
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
 * HERE WE USE EUCLIDEAN METHOD TO OPTIMIZED IT
 * the time complexity was earlier O(min(n1,n2))
 * 
 * what is euclidean method? 
 * gcd(a,b)= gcd(a-b, b)
 * 
 * basically we try to shrink the number 
 * 
 * eg: 20, 15 will become 20-15, 15 i.e 5,15
 * 
 * we can continue doing this until one of the numbers reaches 0 and the remaining number becomes our gcd
 * 
 * but we can do one more thing 
 * we can use 
 * gcd(a,b)= gcd(max(a,b)%min(a,b), min(a,b))
 * 
 * this is done to bring the bigger number forward and then we can just get remainders of the numbers until we reach 0 
 * 
 * so we can avoid many calculative steps and avoid wasting time and resources on non neccessary comparisons
 * when one of the numbers become 0 the other must be the gcd 
 * 
 * 
 * TIME COMPLEXITY IS O(LOG(min(a,b)))
 * 
 * whenever division happens we can see that logarithmic time complexity is present
 */
