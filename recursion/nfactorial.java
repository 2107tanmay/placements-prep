package recursion;
import java.util.*;

public class nfactorial {
    public static int factorial(int n){
        if(n==0) return 0;
        return n+factorial(n-1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the n: ");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}


/*
 the code will just run until 0 is reached after that all numbers will be summed up 
 3 
 3+f(2)-> 2+f(1)-> 1+f(0)
 when f(0) is reached the code will then return the call stack back to 1 
 then 1 and 2 will be added =3
 and then this returned back to 3 +3 =6
 and finally this 6 will be returned to main fuction
 */