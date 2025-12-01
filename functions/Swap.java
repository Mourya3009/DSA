package functions;
import java.util.*;

public class Swap{

    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a: " + a + " and b: " + b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the any two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        swap(num1,num2);
    }
}