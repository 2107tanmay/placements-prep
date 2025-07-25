import java.util.*;

public class bintodec {
    public static int bindtodec(int n){ //this n is the binary number
        int dec=0;
        int pow=0;

        while(n>0){ //kind of same logic for reversing a number just that we add extra formula for this 
            int ld= n%10; //last digit calculator
            dec=dec+(ld * (int) Math.pow(2,pow)); 
            //here we will calculate the actual value of the decimal 
            //formula is decimal+(lastdigit * 2^power of the last digit)
            //if we have anymore digits we just increase the power as we move to further more digits away from decimal points
            pow++;
            n=n/10;
        }
        return dec;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int n = sc.nextInt();
        System.out.println("The decimal conversion of: "+n+" is: "+bindtodec(n));
    }
}
