import java.util.*;
public class reversenumber{
    public static void main(String args[]){
        System.out.println("enter the number u want to reverse");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//this code can only print reversed number 
        // System.out.println("The reversed number becomes:");
        // while(number>0){
        //     int lastdigit = number%10; //this will give the last digit of any number 
        //     System.out.print(lastdigit);
            
        //     number /=10;

        // }

//lets make a code that can store this value for the reversed number
        int rev= 0; //this will store our last digit numbers
        while(number>0){
            int ld = number%10; //last digit extracted
            rev=(rev*10)+ld;
            number/=10;
        }
        System.out.println(rev);
    }
}