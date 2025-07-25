/*
 * lets learn about array syntax:
 * datatype arrayName[] = new datatype[size]; if we dont want to give any size that is fine too as java dynamically allocates it 
 * "new " keyword is most important
 * here arrayName become name of array and datatype define the type of data within array
 * this will just create the array
 * 
 * lets see how to initialize it:
 * 
 * int numbers[]= {1,2,3,3,4,4,5};
 * String fruits[]= {"mango", "banana", "pineapple"}; //this method will directly allocate the size of array by understanding the numbers of variables
 * 
 * arrays are static and it wont change size dynamically later 
 * 
 * 
 * we can use arrayName.length to get the length of the array 
 */

import java.util.*; 

public class arrays{
    public static void main(String args[]){
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks.length);
        

    }
}








