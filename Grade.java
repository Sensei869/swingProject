import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the percentage of the student: ");
        double percent = scan.nextDouble();

        if(percent >= 90){
            System.out.println("A+");
            }
            if(percent >= 90){
            System.out.println("A+");}
            else if(percent >= 80 && percent <90){
            System.out.println("A");}
            else if(percent >= 70 && percent < 80){
            System.out.println("B+");}
            else if(percent >= 60 && percent < 70){
            System.out.println("B");}
            else{
                System.out.println("C");
            }
    }
}