class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int add = 1;
        for(int i = length - 1; i >= 0 ; i--){
            if(digits[i] == 9 && add == 1){
                digits[i] = 0;
            } else if (digits[i] != 9 && add == 1){
                digits[i] = digits[i] + 1;
                add = 0;
                return digits;
            }
        }
        int[] ans = new int[length + 1];
        ans[0] = 1;
        for(int i = 0; i < length; i++){
            ans[i+1] = digits[i];
        }
        return ans;
        
    }
}
