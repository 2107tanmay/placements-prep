package recursion;
import java.util.*;

public class starttonrecursion {
    public static void rec(int i, int n){
        if(i>n) return;
        System.out.println(i);
        rec(i+1,n);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount of numbers to be printed: ");
        int n=sc.nextInt();
        rec(1,n);
    }
}

/*
 * basic recursion logic until the end is reached
 */