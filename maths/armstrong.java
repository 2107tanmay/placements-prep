package maths;

import java.util.*;

public class armstrong {
    public static boolean armstrongno(int N){
        int sum=0;
        int n=N;
        int last=0;
        while(n>0){
            last=n%10;
            sum=sum+(last*last*last);
            n/=10;
        }
        if(sum==N) return true;
        else return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=sc.nextInt();
        System.out.println(armstrongno(n));;
    }
}
