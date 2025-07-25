/*
 * A
 * BC
 * DEF
 * GHIJ
 */


public class characterpattern {
    public static void main(String args[]){
        int n=4; //number of lines 
        char c ='A'; //defines starting character

        for(int line = 1; line<=n; line++){ //outer loop defines how many lines to be printed
            for(int chars=1; chars<=line; chars++){ //this inner loop defines how the characters will be printed i.e increasing or decreasing
                System.out.print(c);
                c++; //this will increase the ascii value of character
            }
            System.out.println();
        }
    }
}
