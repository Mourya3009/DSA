package patterns;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check whether it is prime or not: ");
        int n = sc.nextInt();

        boolean isprime = true;

        for (int i = 2; i < n; i++){
            if( n%i == 0){
                isprime = false;
            }
        }

        if(isprime == true){
            System.out.println("It's a prime Number..");
        }else{
            System.out.println("It's not a prime Number..");

        }
    }
}
