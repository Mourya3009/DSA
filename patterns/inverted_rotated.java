package patterns;
import java.util.Scanner;
public class inverted_rotated {

    public static void inverted_rotated(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int tr = sc.nextInt(); 
        System.out.println("Enter the number of columns:");
        int tc = sc.nextInt(); 

        for (int i = 1; i <= tr; i++){
            for (int spaces = 1; spaces<=tr-i; spaces++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        inverted_rotated();
    }   
}