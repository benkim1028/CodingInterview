class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    List<Integer> element = new ArrayList<>();
                    element.add(nums[i]);
                    element.add(nums[start]);
                    element.add(nums[end]);
                    if(!ans.contains(element))
                        ans.add(element);
                }
                if(sum < 0)
                    start++;
                else
                    end--;
            }
        }
        return ans;
    }
}
