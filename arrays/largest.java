package arrays;
import java.util.Scanner; 
public class largest {
 

    public static void largest(int numbers[]){
        int largest_val = Integer.MIN_VALUE;//MIN_VALUE represents -infinity in java 
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>largest_val){
                largest_val = numbers[i];                
            }
        } 
        System.out.print("The largest value in the array is : "+largest_val);
    }
    
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        largest(numbers);

        
    }
}


