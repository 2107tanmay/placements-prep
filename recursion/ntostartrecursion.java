package recursion;
import java.util.*;

public class ntostartrecursion {
    public static void rec(int i){
        if(i<1) return;
        System.out.println(i);
        rec(i-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter where you want to start: ");
        int n=sc.nextInt();
        rec(n);
    }
}

/*
 * in this code i used same recursive logic but here we only check if the number is less than 1 if yes then we give return and all the stack collapses
 * similarly if the number is greater than 1 then again a recursive call will be made.
 */