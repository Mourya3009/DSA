package arrays;

public class bubble_sort {

    public static void bubble(int numbers[]){
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
    public static void print(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]);
        }
    }
    public static void main(String[] args){
        int numbers[] = {5,4,1,3,2};
        bubble(numbers);
        print(numbers);

    }
}
