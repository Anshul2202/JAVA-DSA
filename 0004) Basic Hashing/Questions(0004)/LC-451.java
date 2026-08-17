// 451 - Sort Characters By Frequency

class Solution451 {
    public String frequencySort(String s) {
        
        int[] hashArr = new int[256];

        for(int i = 0; i < s.length(); i++){

            hashArr[s.charAt(i)] += 1;
        }

        StringBuilder sb = new StringBuilder();

        while(true){

            int maxFq = -1;
            char ch = ' ';

            for(int i = 0; i < s.length(); i++){
                
                if(hashArr[s.charAt(i)] > maxFq){
                    maxFq = hashArr[s.charAt(i)];
                    ch = s.charAt(i);
                }
            }

            hashArr[ch] = -1;

            for(int i = 0; i < maxFq; i++){
                sb.append(ch);
            }

            if(sb.length() == s.length()) return sb.toString();
        }
    }
}