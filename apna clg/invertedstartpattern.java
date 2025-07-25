public class invertedstartpattern {
    public static void main(String args[]){
        for(int i =1; i<=4; i++){ //the outer for loop will define how many lines will be printed vertically so it increments
            for(int stars= 4; stars>=i; stars--){ //this inner for loop decreases as it starts with 4 stars but then as line number increases the amount of stars shall decrease
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
