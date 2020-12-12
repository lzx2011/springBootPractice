package com.lzhenxing.myproject.algorithm.interview;

/**
 *   ClassName: Leetcode670 <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/18
 */
public class Leetcode670 {

    public static int swap2maxNum(int num) {
        char[] A = Integer.toString(num).toCharArray();
        int[] last = new int[10];
        for (int i = 0; i < A.length; i++) {
            last[A[i] - '0'] = i;
        }

        for (int i = 0; i < A.length; i++) {
            for (int d = 9; d > A[i] - '0'; d--) {
                if (last[d] > i) {
                    char tmp = A[i];
                    A[i] = A[last[d]];
                    A[last[d]] = tmp;
                    return Integer.valueOf(new String(A));
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(swap2maxNum(2736));
        System.out.println(swap2maxNum(9973));
    }

}
