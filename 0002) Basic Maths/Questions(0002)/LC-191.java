// 191 - Number of 1 Bits

class Solution191 {
    public int hammingWeight(int n) {
        
        String binary = Integer.toBinaryString(n);

        int count = 0;

        for(int i = 0; i < binary.length(); i++){
            
            if(binary.charAt(i) == '1') count++;
        }

        return count;
    }
}