// Minimize Max Distance to Gas Station

class gasStationSol {
    public double minimiseMaxDistance(int[] arr, int k) {

       int maxDist = -1;

       for(int i = 0; i < arr.length - 1; i++){
            maxDist = Math.max(maxDist , arr[i + 1] - arr[i]);
       }

       double low = 0, high = maxDist;

       while(high - low > 1e-6){
        
        double mid = (low + high) / 2;

        if(noOfGasStations(arr , mid) <= k) high = mid;
        else low = mid;

       }

       return high;
    }

    public int noOfGasStations(int[] nums , double dist){

        int cnt = 0;

        for(int i = 0; i < nums.length - 1; i++){
            
            double gap = nums[i + 1] - nums[i];

            cnt += (int) Math.ceil(gap / dist) - 1;
        }

        return cnt;
    }
}
