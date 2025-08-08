package recursion;
import java.util.*;

public class palindrom {

    public static boolean check(String s, int i){
        s=s.toLowerCase();
        char[] str = s.toCharArray();
        if(i>=str.length/2) return true;
        if(str[i]!=str[str.length-i-1]) return false;
        check(s,i+1);
        return true;
    }

 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str= sc.next();
    Boolean ans= check(str,0);
    if(ans==true) System.out.println("Palindorme");
    else System.out.println("Not a palindrome!");

 }   
}

/*
 * this code will first take input from the user for the string
 * convert to a lower case so that there is compatibility for the word even in camel case
 * later it will be parsed into a character array
 * using the stringvariable.toCharArray() method
 * 
 * and then we check if the current element is not to the corresponding element from the back of the array
 * if yes then we just return false and then the answer will be not plaindrome
 * 
 * where as when the i reaches the middle word of the sentence then we will just return true as there can nothing be new later on to check 
 * this saves time
 * 
 * this code helped me understand recursion in bettter manner
 */