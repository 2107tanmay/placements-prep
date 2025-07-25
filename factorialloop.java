public class factorialloop {

    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }

    public static int binomialcoefficient(int n, int r){
        int bc = (factorial(n))/(factorial(r)*(factorial(n-r)));
        return bc;
    }

    public static void main(String args[]){
        //System.out.println(factorial(5));
        System.out.println(binomialcoefficient(5, 2));
        //now lets calculate binomial coefficient formula = n!/(r!(n-r)!)
        //we can use our already created code of factorial to calculate these

    
    }
}
