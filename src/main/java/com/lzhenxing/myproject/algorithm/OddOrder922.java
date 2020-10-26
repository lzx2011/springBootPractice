package com.lzhenxing.myproject.algorithm;

import java.util.Arrays;

/**
 *   ClassName: OddOrder922 <br/>   Function: <br/>
 *
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * @author zhenxing.liu
 * @date 2020/10/25
 */
public class OddOrder922 {

    public static void sortArray(int[] num){
        int j = 1;
        int length = num.length;
        if(length == 0 || length == 1){
            return;
        }
        for(int i = 0; i < length; i += 2){
            if(num[i] % 2 == 1){
                while(j < length){
                    if(num[j] % 2 == 0){
                        int temp = num[i];
                        num[i] = num[j];
                        num[j] = temp;
                        break;
                    }
                    j += 2;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {4,2,5,7};
        sortArray(num);
        for(int i : num){
            System.out.println(i);
        }
    }
}
