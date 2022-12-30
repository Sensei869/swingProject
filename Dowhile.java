import java.util.Scanner;
public class Dowhile {
    public static void main(String[] args){
        
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter toal");
        int total = input.nextInt();

        String[]friends = new String[total +1];

        do{
            System.out.println("Enter name");
            String name = input.nextLine();
            friends[count ] = name;
            //System.out.println(friends[count-1]);
            ++count;
        }
        while(count <= total);

        count = 0;
        do{
            System.out.println(friends[count]);
            count++;
        } while (count <= total);
        }
    }
