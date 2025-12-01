package arrays;

import java.util.Scanner;

public class binary {
    public static void binary_search(int numbers[],int key){
        int n=numbers.length;
        int start = 0;
        int end = n-1;
        int mid = (start+end)/2;

        while(start<end){
            if(numbers[mid] == key){
                System.out.print(key+" Found at the index: "+mid);
                break;
            }else if(key<numbers[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("What is the key element: ");
        int key = sc.nextInt();

        binary_search(numbers, key);
    }
}
