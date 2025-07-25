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