package arrays;

public class subarrray {
    public static void subarray(int numbers[]){
        int total_subarrays = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            
            
            System.out.println("Subarrays from number "+numbers[i]);
            for(int j=i;j<numbers.length;j++){
                int tot_sum = 0;
                for(int k=i;k<=j;k++){                    
                    System.out.print("[ "+numbers[k]+" ]");
                    tot_sum = tot_sum+numbers[k];                    
                } 
                total_subarrays++; 
                //sum of the subarray
                System.out.print(" ==> " + tot_sum);
                //maximum subarray 
                if(tot_sum>max_sum){
                    max_sum = tot_sum;
                } 
                System.out.println();
            }
            
        }
        System.out.println("The maximum sum of a subarray: "+max_sum);
        System.out.println("The total number of subarrays: "+total_subarrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
    }
}
