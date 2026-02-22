class Solution {
    public int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1); 
    }
    public boolean isDigitorialPermutation(int n) {
        int temp=n;
        int sum=0;
        int count=0;
        while(temp>0){
            int rem=temp%10;
            sum+=fact(rem);
            temp/=10;
            count++;
        }

        char[] arr1 = String.valueOf(n).toCharArray();
        char[] arr2 = String.valueOf(sum).toCharArray();

        if(arr1.length != arr2.length) return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean ans = Arrays.equals(arr1,arr2);
        return ans;
        
        // int temp1 = n;
        // while(temp1 > 0){
        //     count++;
        //     temp1 /= 10;
        // }
        // int[] count1 = new int[count];
        // int first=n;
        // for(int i=0;i<count;i++){
        //     int rem=first%10;
        //     count1[i]=rem;
        //     first/=10;
        // }
        // int[] count2 = new int[count];
        // int second=sum;
        // for(int i=0;i<count;i++){
        //     int rem=second%10;
        //     count2[i]=rem;
        //     second/=10;
        // }
        
    }
}