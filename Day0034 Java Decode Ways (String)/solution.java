class solution {   
        
        public int numDecodings(String s) {
    int[] dp = new int[s.length() + 1];
    dp[0] = 1;
    if (s.charAt(0) == '0') {
        return 0;
    }
    dp[1] = 1;
 
    for (int i = 1; i < s.length(); i++) {
        char c = s.charAt(i);
        char p = s.charAt(i - 1);
 
        if (c == '0' && (p == '0' || p > '2')) {
            return 0;
        }
 
        if (p == '0') {
            dp[i + 1] = dp[i];
        } else if (p == '1') {
            if (c == '0') {
                dp[i + 1] = dp[i - 1];
            } else {
                dp[i + 1] = dp[i - 1] + dp[i];
            }
        } else if (p == '2') {
            if (c == '0') {
                dp[i + 1] = dp[i - 1];
            } else if (c <= '6') {
                dp[i + 1] = dp[i] + dp[i - 1];
            } else {
                dp[i + 1] = dp[i];
            }
        } else {
            dp[i + 1] = dp[i];
        }
 
    }
 
    return dp[s.length()];

        
        
        
    }
}