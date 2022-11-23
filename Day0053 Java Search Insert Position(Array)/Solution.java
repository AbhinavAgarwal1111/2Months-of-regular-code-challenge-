class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;

        if(nums.length==1 && target>nums[0]){
            return 1;
        }

        for(int i=0;i<nums.length-1;i++){
            if(target == nums[i]){
                result =  i;
                break;
            }else if(target>nums[i] && target<=nums[i+1]){
                result = i+1;
                break;
            }else if(target>nums[i+1] && (nums.length-1==i+1)){
                result= nums.length;
                break;
            }else if(target<nums[i] && i==0){
                result =  0;
                break;
            }else if(target>nums[i] && target>nums[i+1]){
                continue;
            }
        }

        return result;

    }
}