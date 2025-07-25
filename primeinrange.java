public class primeinrange {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){ //this is done to slash down comparisons made in half as after the halfway point the numbers keep on repeating themselves 
            if(n%i==0){
                return false; //checks if a number is prime or not?
            }
        }

        return true;
    }

    public static void pInRange(int n){
        for(int i=1; i<=n; i++){
            if(isprime(i)){
                System.out.println(i+" is a prime number.");
            }
        }
    }

    public static void main(String args[]){
        pInRange(100);
    }
}
