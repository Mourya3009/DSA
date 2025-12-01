package functions;
import java.util.Scanner;

public class Factorial {

    public static int fact(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        return fact(num-1)*num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial");
        int a = sc.nextInt();
        System.out.println(fact(a));
    }
}
