package arrays;
import java.util.Scanner;
public class linear {
    public static void linear_search(int numbers[], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]==key){
                System.out.println(key+" Found at index: "+i);
            }else{
                System.out.println("key not found in the array.!")
            }
        } 
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("What is the key element: ");
        int key = sc.nextInt();

        linear_search(numbers, key);
    }
}
