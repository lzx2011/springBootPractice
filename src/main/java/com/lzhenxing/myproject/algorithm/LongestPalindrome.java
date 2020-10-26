package com.lzhenxing.myproject.algorithm;

/**
 *   ClassName: LongestPalindrome <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/10/24
 */
public class LongestPalindrome {

    /**
     * 判断是否是回文
     * @param str
     * @return
     */
    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i = 0; i < length; i++){
            if(str.charAt(i) != str.charAt(length - i -1)){
                return false;
            }
        }
        return true;
    }

    /**
     * 子串暴力尝试判断
     * @param str
     * @return
     */
    public static String longestPalindrome(String str){
        int length = str.length();
        int maxLength = 0;
        String result = null;
        for(int i = 0; i < length; i++){
            for(int j = i + 1; j < length; j++){
                String subString = str.substring(i, j + 1);
                if(isPalindrome(subString) && subString.length() > maxLength){
                    maxLength = subString.length();
                    result = subString;
                }
            }
        }
        return result;
    }

    /**
     * 动态规划版解法
     * @param s
     * @return
     */
    public static String longestPalindromeDynamicProgramming(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;
                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String str = "addaba";
        //String str = "aa";
        //System.out.println(longestPalindrome(str));
        System.out.println(longestPalindromeDynamicProgramming(str));
    }
}
