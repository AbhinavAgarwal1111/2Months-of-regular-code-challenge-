class Solution {
    int[] original = null;
    int[] shuffle = null;
    Random rand = null;
 
    public Solution(int[] nums) {
        original = nums;
        shuffle = Arrays.copyOf(nums, nums.length);
        rand = new Random();
    }
 
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        shuffle = Arrays.copyOf(original, original.length);
        return shuffle;
    }
 
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0; i<shuffle.length; i++){
            int x = rand.nextInt(shuffle.length-i);
            int idx = x+i;
 
            int tmp = shuffle[idx];
            shuffle[idx] = shuffle[i];
            shuffle[i] = tmp;
        }
        return shuffle;
    }
}