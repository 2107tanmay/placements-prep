package maths;

import java.util.*;

public class palindrome {

    public static boolean pali(int N){
        int n=N;
        int rev=0;
        int last=0;
        while(n>0){
            last=n%10;
            n/=10;
            rev=(rev*10)+last;
        }

        if(rev==N) return true;
        else return false;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(pali(n));
    }
}

/*
 * in this we had to just use reverse number logic and check if both number match or no? if yes then true if no then false
 * it was fairly simple too 
 */
