import java.util.*;

public class bubblesort {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        int arr[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter array element: ");
            arr[i]=sc.nextInt();
        }

        sort(arr, size);
    }

    public static void sort(int[] arr, int n){
        int temp;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       System.out.println("the sorted array is: ");
       for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        } 
    }
}
