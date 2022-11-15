class Solution {
    public void sortColors(int[] nums){
    if(nums==null||nums.length<2){
        return;
    }
 
    int[] countArray = new int[3];
    for(int i=0; i<nums.length; i++){
        countArray[nums[i]]++;
    }
 
    int j = 0;
    int k = 0;
    while(j<=2){
        if(countArray[j]!=0){
            nums[k++]=j;
            countArray[j] = countArray[j]-1;
        }else{
            j++;
        }
    }
}
        
    }