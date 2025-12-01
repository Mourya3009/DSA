package functions;
import java.util.*;
public class Primesinrange {

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++ ){
            if(num%i == 0){
                return false;
            } 
        }
        return true;        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range from 0 :  ");
        int num = sc.nextInt();    
        for (int i = 2; i<=num;i++) {
            boolean result = isPrime(i);

            if(result == true){
                System.out.print(i+"\t");
            }
        }

    }
}    
