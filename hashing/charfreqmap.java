package hashing;
import java.util.*;

public class charfreqmap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string: ");
        String s=sc.nextLine();
        char[] ch= s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }
            else{
                map.put(ch[i],1);
            }
        }


        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println("character: "+entry.getKey()+" frequency: "+entry.getValue());
        }
    }
}


/*
 * here we just put the string
 * then converted it to a character array
 * later we just check if the element is already present in the hashmap as out key 
 * if no then we add it with value of 1 
 * if yes then we just fetch the value and update it by adding 1 to it
 * 
 * later to fetch we just create a entry point and then use that as our fetching element for key and value
 * 
 */