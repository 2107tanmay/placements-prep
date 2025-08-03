package recursion;
import java.util.*;

public class reversearray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the amount of array elements: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.print("enter the element"+i+" : ");
            int num = sc.nextInt();
            arr[i]=num;
        }
        reversearr(0, arr, n);
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }    

    public static void reversearr(int i, int arr[], int n){
        if(i>n/2) return;
        int temp=0;
        temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-1-i]=temp;

        reversearr(i+1, arr, n);
    }

    

}


