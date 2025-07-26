package maths;
import java.util.*;

public class factors {

    public static ArrayList<Integer> factor(int n){
        ArrayList<Integer> nums= new ArrayList<Integer>();

        for(int i=1; i<= Math.sqrt(n); i++){
            if(n%i==0){
                nums.add(i);
                if(n/i != i){
                    nums.add(n/i);
                }
            }
        }
        return nums;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        ArrayList<Integer> num = factor(n);
        Collections.sort(num);
        for(int i=0; i<num.size(); i++){
            System.out.print(num.get(i)+" ");
        }
    }
}


/*
 * here i learnt how to use arraylist<datatype> and how to use it 
 * as well as got to know that array list uses a 0 based indexing so have to keep that in mind while traversing
 * as well as i need to learn how the square root works in order to implement it later without using any inbuilt methods
 * here in this code we just made sure that the number i are the ones that can fully divide the given n 
 * after that we printed the number  or added it to our list and then we check if the number i.e. i is equal to n/i which means same number 
 * for 36 it is 6*6 so to avoid duplicate entries we added this condition
 * 
 * to be honest we could let the loop run till n but using sqrt we eliminated half the posibilites saving us a huge deal of time 
 * 
 * as well as array list was used as we never know how many elements we will need to add to array so hence we cannot use the default arrays in java :)
 * we use arraylist for dynamic sizing and applications 
 * it has methods like add(to add new element) get(to fetch element at index) size(for size) clear(delete whole data) set(modify) and finally delete(element from a specific index)
 * using these methods we can easily play around with array list 
 */