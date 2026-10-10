// Minimize Max Distance to Gas Station

class gasStationSol {
    public double minimiseMaxDistance(int[] arr, int k) {

        int[] howMany = new int[arr.length - 1];
        
        for(int i = 1; i <= k; i++){

            double maxDist = -1;
            int maxIdx = -1;

            for(int j = 0; j < arr.length - 1; j++){

                double diff = arr[j + 1] - arr[j];
                double currentDist = (double) diff / (howMany[j] + 1);

                if(currentDist > maxDist){
                    maxDist = currentDist;
                    maxIdx = j;
                }
            }

            howMany[maxIdx]++;
        }

        double result = 0;

        for(int i = 0; i < arr.length - 1; i++){
            double diff = arr[i + 1] - arr[i];
            double distance = diff / (howMany[i] + 1);

            result = Math.max(result , distance);
        }

        return result;
    }
}
