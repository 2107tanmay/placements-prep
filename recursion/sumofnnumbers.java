package recursion;
import java.util.*;

public class sumofnnumbers {
    public static void rec(int n, int sum){
        if(n<1){
            System.out.print(sum);
            return;
        }
        sum=sum+n;
        rec(n-1,sum);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n value: ");
        int n=sc.nextInt();
        rec(n,0);
    }
}

/*
 * i dont know if this is best solution but i took a sum variable which will always update the value and then we just check the logic if the i is greater than n
 * if yes return the sum and return the control end recursion
 * if no then we add i to sum and then pass on new i values and sum values to a new recursive function
 * 
 * here we used a new logic where we give the final value of n and just check if the number is greater than 1 if yes then we add the sum and pass decremented i and a new sum to next function
 * as soon as the i becomes equal to 1 we print out our sum and just return all recursion control back to main and terminate it
 */