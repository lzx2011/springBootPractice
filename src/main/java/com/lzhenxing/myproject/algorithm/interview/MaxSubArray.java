package com.lzhenxing.myproject.algorithm.interview;

/**
 *   ClassName: MaxSubArray <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/12/7
 */
public class MaxSubArray {

    public static void main(String[] args) {
        //int[] arr = {1,1,-3,4,5};
        int[] arr = {-1,-1,-3,-4,-5};
        System.out.println(maxSubArr(arr));
        //System.out.println(FindGreatestSumOfSubArray(arr));
    }

    public static int maxSubArr(int[] arr){
        if(arr == null || arr.length == 0){
            return 0;
        }
        int length = arr.length;
        int[] dp = new int[length + 1];
        dp[1] = arr[0];
        for(int i = 2; i <= length; i++){
            dp[i] = Math.max(dp[i-1] + arr[i-1], arr[i-1]);
        }
        return dp[length];
    }

    public static int FindGreatestSumOfSubArray(int[] array) {
        //max就是上面的dp[i]
        int max = array[0];
        //因为这个dp[i]老是变，所以比如你dp[4]是8 dp[5]就变成-7了，所以需要res保存一下
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(res, max);
        }
        return res;
    }


}
