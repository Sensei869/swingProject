import java.util.Scanner;

public class Branching{

    public static void main(String [] args){

        // Check whether number is odd or even
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num = scan.nextInt();

        if (num%2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}