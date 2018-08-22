class Solution {
    public int reverse(int x) {
        int ans;
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        int start = (arr[0] == '-') ? 1 : 0;
        int end = arr.length - 1;
        while(start < end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
        try{
            ans = Integer.valueOf(String.valueOf(arr));
        } catch(Exception e){
            return 0;
        }
        return ans;
    }
}
