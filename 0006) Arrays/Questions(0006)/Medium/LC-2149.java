// 2149 - Rearrange Array Elements by Sign

class Solution2149 {
    public int[] rearrangeArray(int[] nums) {

        int pIdx = 0;
        int nIdx = 1;

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0){
                result[pIdx] = nums[i];
                pIdx += 2;
            }
            else{
                result[nIdx] = nums[i];
                nIdx += 2;
            }
        }
        
        return result;
    }
}