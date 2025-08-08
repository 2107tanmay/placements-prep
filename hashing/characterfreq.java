package hashing; 
import java.util.*;


public class characterfreq {
    public static void check(char ch[], int size){
        Scanner sc= new Scanner(System.in);
        int hash[]=new int[26];
        Arrays.fill(hash, 0);
        
        for(int i=0; i<size; i++){
            hash[ch[i]-'a'] +=1;
        }

        System.out.println("enter the amount of characters u want to check: ");
        int n=sc.nextInt(); 
        char c;
        for(int i=1; i<=n; i++){
            System.out.println("enter character to check: ");
            c=sc.next().charAt(0);
            System.out.println("freq is "+hash[c-'a']);
        }

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string: ");
        String s=sc.nextLine();
        char ch[]= s.toCharArray();
        int size=ch.length;
        check(ch, size);
    }
}
/*
 * for this code i created a hash array and we just traversed all the elements and incremented the value at the given index for that element
 * later while result is being shown we just fetch the same element in the hash array as index and the value is shown
 */