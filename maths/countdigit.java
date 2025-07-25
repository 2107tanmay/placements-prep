package maths;

import java.util.*;

public class countdigit{

    public static int countd(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(countd(n));
    }

}

/*
 * here we just divide a number by 10 at each round and increment counter by one
 * this removes one decimal space from the original number and hence it can run till number goes to 0.n 
 * where the while loop stops and the count is returned 
 */