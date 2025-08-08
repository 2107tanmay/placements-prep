package recursion;
import java.util.*;

public class fibonacci {
    public static int check(int n){
        if(n<=1) return n;
        return check(n-1)+check(n-2);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("the fibonacci number is: "+check(n));
    }
}
/*
 * lets understand what a fibonacci number is
 * lets say we want n=6
 * so 0 1 then 0+1 will be 1
 * 1 +1 will become 2
 * 0, 1, 1, 2 now 1+2 will be 3
 * 0, 1, 1, 2, 3 will be 2+3 =5
 * 0, 1, 1, 2, 3, 5
 * 
 * so now the 5th fibonacci is 5 
 * 
 * if we continue 6th will be 8 
 * then 7th will be 13 
 * and so on
 * 
 * 
 * basicall we have to add up the current and last number's fibonacci
 * 
 * 
 * 
 * the check function code explanation:
 * basically the control will be first handed over to the firs call of n (5 forr example)
 * then we will check if n=1 or n=0 so basicall n<=1 or not?
 * if yes then we just return n as the answer which is either 1 or 0
 * 
 * if no then we will call 2 functions simulatneously 
 * first will do n-1 and the second will check n-2
 * 
 * and then those recursive function get the control 
 * 
 * and carry on until they reach the n<1 state
 * 
 * then these 2 function's answers are summed up and returned finally to the main function 
 */