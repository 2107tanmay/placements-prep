package hashing;
import java.util.*;

public class freqmap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++){
            System.out.print("enter the array element: ");
            arr[i]=sc.nextInt();
        }

        //pre compute the frequency
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<size; i++){
            if(hash.containsKey(arr[i])) 
            {
                hash.put(arr[i], hash.get(arr[i])+1);
            }
            else{
                hash.put(arr[i],1);
            }
        }

        
            //here we will fetch the code
            for(Map.Entry<Integer, Integer> entry: hash.entrySet()){
                System.out.println("key: "+entry.getKey()+" frequency: "+entry.getValue());
            }
    }
}

/*
 * in this code i used the hashmap which was way faster and cleaner to user
 * 
 * in first processing part i just used the hasmap and then we check if there is the key already present in the map 
 * if yes then we just update the value of the map by setting the key to arr[i] i.e. main element and freq is set by retrieving current value and incrementing it by 1
 * 
 * incase the element doesnt exist then we just add the key as arr[i] (element id) and as value we set it to 1 
 * 
 * for retrieving the value we make a entry
 */