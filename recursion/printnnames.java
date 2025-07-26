package recursion;
import java.util.*;

public class printnnames {
    public static void rec(int i, int n){
        if(i>n) return;
        System.out.println("tanmay");
        rec(i+1,n);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter how many times do you want the number to be printed: ");
        int n= sc.nextInt();
        rec(1,n);
    }
}

/*
 * this recursion code is fairly simple as it has nthn but when we put a base case statement that will terminate it 
 * the function will be ran recursively until a return statement is found 
 * once it is found then the name tanmay is printed it returns the control back to parent function again the name is printed and then this continues till we fully are back to main function 
 * and then the function calls stack will be emptied
 * incase a recursive function has no statement then the code will run indefinetly until the function call stack
 */
