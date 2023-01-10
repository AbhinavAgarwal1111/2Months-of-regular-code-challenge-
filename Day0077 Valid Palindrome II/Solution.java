class Solution {
    private boolean isPal(int l,int r,String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0,r = s.length() - 1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            l++;r--;
        }
        return isPal(l+1,r,s) || isPal(l,r-1,s);
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
