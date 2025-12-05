package arrays;

public class Trapping_rainwater{
    public static void trapped(int bars[]){
        int n = bars.length;
        int max_left[] = new int[n];
        int max_right[] = new int[n];
        
        int tot_trapped = 0;
        

        //max left array calculation        
        max_left[0] = bars[0];
        for(int i=1;i<n;i++){
            max_left[i] = Math.max(bars[i], max_left[i-1]);            
        }
        //max right array calculation
        max_right[n-1] = bars[n-1];
        for(int i=n-2;i>=0;i--){
            max_right[i] = Math.max(bars[i], max_right[i+1]);
        }
        
        for(int i=0;i<n;i++){
            int water_level = Math.min(max_left[i],max_right[i]);
            //find area of the water has been stored on each bar
            tot_trapped += water_level - bars[i];
        }
        System.out.print("total trapped water area : "+tot_trapped);

    }
    public static void main(String[] args) {
        int bars[] = {4,2,0,6,3,2,5};
        trapped(bars);
    }
}