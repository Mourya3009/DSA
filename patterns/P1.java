package patterns;
import java.util.Scanner;

public class P1{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Square Pattern");
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt();
        
        for (int i=1;i<=n;  i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
}