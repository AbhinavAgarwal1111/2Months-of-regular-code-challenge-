class Solution {
    public int[] plusOne(int[] digits) {
     int carry=0, sum=0, index=digits.length-1;
        while(index>=0){
        if (index==digits.length-1) {
            
        sum=digits[index]+1;
        } else {
            sum=digits[index]+carry;
        }
            carry=0;
            if (sum<9) {
                digits[index]=sum;
            } else {
                carry=sum/10;
                digits[index]=sum%10;
            }
            index--;
        }
        if(carry==1) {
            int[] arr = new int [digits.length+1];
            arr[0]=1;
            digits=arr;
        }
        return digits;
    }
}