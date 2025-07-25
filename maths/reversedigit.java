package maths;

import java.util.*;

public class reversedigit{

    public static void reverse(int n){
        int rev=0;
        int last=0;
        while(n>0){
            last=n%10;
            n/=10;
            rev=(rev*10)+last;
        }
        System.out.println("the reverse is: "+rev);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        reverse(n);
    }
}

/*
 * in this code we just take remainder of a number from 10 this gives us whatever the last digit will be
 * and then we initiliazie a rev variable that is at 0 
 * everytime a new last digit is found we just multiply the rev by 10 and insert the last digit
 * 
 */