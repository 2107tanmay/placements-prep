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
