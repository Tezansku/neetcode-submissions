class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] bigger = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++){
            bigger[i] = nums [i];
            bigger[i + nums.length] = nums [i];
        }
       return bigger; 
    }
}