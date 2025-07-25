import java.util.Scanner;

public class dectobin {
    public static int dectobin(int n){ //input = decimal number
        int bin=0; //binary number
        int pow=0; //power

        while(n>0){
            int rem=n%2; //remainder
            bin= bin+(rem * (int) Math.pow(10, pow)); 
            //the above formula for math.pow will send the remainder to adequate place i.e. 10^0 is units
            // 10^1 is tens place
            // 10^2 is hundreds place etc
            // this number is then added to our actual binary number 
            pow++;  //as we move forward we increase the number's place hence we increase the power to do so 
            n/=2; //divide the decimal number by 2 
        }
        return bin;
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = sc.nextInt();
        System.out.println("The binary conversion of: "+n+" is: "+dectobin(n));
    }

}
