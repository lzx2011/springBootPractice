package com.lzhenxing.myproject.algorithm;

/**
 *   ClassName: LongestCommonSubsequence <br/>   Function: <br/>
 *  最长公共子序列
 * @author zhenxing.liu
 * @date 2020/10/26
 */
public class LongestCommonSubsequence {

    public static int longestCommonSubsequence(String str1, String str2){
        if(str1 == null || str2 == null){
            return 0;
        }
        int length1 = str1.length();
        int length2 = str2.length();
        String lcs = "";
        int[][] dp = new int[length1+1][length2+1];
        for(int i = 0; i < length1; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < length2; j++){
            dp[0][j] = 0;
        }
        for(int i = 1; i < length1 + 1; i++){
            for(int j = 1; j < length2 + 1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    lcs += str1.charAt(i-1);
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(lcs);
        return dp[length1][length2];
    }

    /**
     * 最长公共子串
     * @param s
     * @param t
     * @return
     */
    public static int getLCS(String s, String t) {
        if (s == null || t == null) {
            return 0;
        }
        String resultStr = "";
        int result = 0;
        int sLength = s.length();
        int tLength = t.length();
        int[][] dp = new int[sLength + 1][tLength + 1];
        for (int i = 1; i <= sLength; i++) {
            for (int j = 1; j <= tLength; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    resultStr += s.charAt(i - 1);
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(dp[i][j], result);
                }
            }
        }
        System.out.println(resultStr);
        return result;
    }

    public static void main(String[] args) {
        //System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(getLCS("abcde", "bcd"));
    }
}
