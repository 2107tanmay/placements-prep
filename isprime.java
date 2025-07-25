import java.util.*;

public class isprime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isprime = true;
        
        if(number==2){
            System.out.println("the entered number is prime");
        }
        else
        {
            for(int i =2; i<Math.sqrt(number); i++){ 
                /*this method is very bad so we can use sqrt of the number as after the sqrt the numbers keep on repeating themselves
                 * this will save us a lot of time
                 * for implementing that method we just need to change the for loop statement to:
                 * for(int i = 0; i<Math.sqrt(number); i++)
                 * 
                 * the Math.sqrt() method can be used to find out sqrt of a number :) it is inbuillt in java.util package itself 
                 * 
                 * in brute force method the time complexity become n-2 as we skip the final number and first i.e 1 and the last condition to check
                 * 
                 * where as in this optimized method the time complexity becomes log(n) or sqrt(n)
                 * 
                 */
            if(number%i==0){
                isprime=false;
                break;
            }
            }

            if(isprime==true){
                System.out.println("The given number is prime in nature "+number);
            }
            else{
                System.out.println("The give number is composite i.e. Non prime in nature");
            }
        }
    


    }
}
