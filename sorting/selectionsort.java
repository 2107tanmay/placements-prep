import java.util.*;
public class selectionsort{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of array:");
        int len=sc.nextInt();
        int val=0;
        int arr[]=new int[len];
        for(int i=0; i<len; i++){
            System.out.println("enter the value to enter at index "+(i+1));
            val=sc.nextInt();
            arr[i]=val;
        }
        sort(arr, len);
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void sort(int arr[], int n){
        for(int i=0; i<=n-2; i++){
            int min=i;
            for(int j=i; j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}