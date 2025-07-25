package sorting;
import java.util.*;

public class bubblesort {

    public static int[] sort(int arr[]){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i =0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("array before sort: ");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("array after sort: ");
        int res[]=sort(arr);
        for(int i =0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }

    }
}
