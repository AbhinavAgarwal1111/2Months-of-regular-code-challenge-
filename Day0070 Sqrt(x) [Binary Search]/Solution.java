class Solution {
    public int mySqrt(int x) {
      if (x < 2) return x;
        
        int right = x / 2;
        int left = 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if ((long)mid*mid > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;   
    }
}
