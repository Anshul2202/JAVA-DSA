// 1482 - Minimum Number of Days to Make m Bouquets

class Solution1482 {
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < (long) m * k) return -1;
        
        int min = bloomDay[0] , max = bloomDay[0];

        for(int i = 1; i < bloomDay.length; i++){
            min = Math.min(min , bloomDay[i]);
            max = Math.max(max , bloomDay[i]);
        }

        int low = min , high = max;

        while(low <= high){

            int mid = low + (high - low) / 2;
            if(noOfBqts(bloomDay , k , mid) >= m) high = mid - 1;
            else low = mid + 1;
        }

        return low;
    }

    public int noOfBqts(int[] days, int k , int n){

        int cnt = 0, bqts = 0;

        for(int i = 0; i < days.length; i++){

            if(days[i] <= n) cnt++;
            else{
                bqts += cnt/k;
                cnt = 0;
            }
        }
        bqts += cnt/k;

        return bqts;
    }
}