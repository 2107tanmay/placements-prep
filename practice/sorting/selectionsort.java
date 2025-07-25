package sorting;
import java.util.*;

public class selectionsort {

    public static int[] sort(int arr[]){
        
        for(int i =0; i<arr.length ; i++){

            int minimum=i;

            for(int j = i+1 ; j< arr.length; j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }

        int temp = arr[minimum];
        arr[minimum]=arr[i];
        arr[i]=temp;
        
        }

        return arr;
        
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int val=0; 

        System.out.println("enter the length of array: ");
        int len = sc.nextInt();
        int arr[]= new int[len];
        for(int i = 0; i<len; i++){
            System.out.println("enter the "+i+"th element of array. ");
            val=sc.nextInt();
            arr[i]=val;
        }

        System.out.println("array before sorting: ");
        for(int i = 0; i<len; i++){
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();


        int arr1[]= sort(arr);
        System.out.println("array after sorting: ");
        for(int i = 0; i<len; i++){
            System.out.print(arr1[i]+" ");
            
        }
    }
}


