public class MethodOverloading
    private static void sum(int a, int b){
        int sum = a+b;
        System.out.println("The sum of two number is:"+ sum); 
    }
    private static void sum (int a, int b, int c){
        int  sum = a+b+c;
        System.out.println("The sum of three number is:" + sum);
    }

    public static void main(String[] args){
        int x = 5, y = 10, z = 6;
        sum(x, y);
        sum(x, y, z);
    }
}