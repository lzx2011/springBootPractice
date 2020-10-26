package com.lzhenxing.myproject.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *   ClassName: FindSum <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/10/25
 */
public class FindSum {

    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 6, 7};
        System.out.println(findList(num, 9));
    }

    /**
     * 给定升序整形数组和m，a和b是数组中的两个元素；求a+b=m的数据对有多少？
     * 输入数组 [1, 2, 4, 5, 6, 7], m = 9,
     * 输出 [2, 7], [4, 5]
     *
     * @param num
     * @param m
     * @return
     */
    public static List<List<Integer>> findList(int[] num, int m){
        List<List<Integer>> resultList = new ArrayList();
        int length = num.length;
        if(length == 0 || length == 1 ){
            return null;
        }
        int i = 0;
        int j = length -1;
        while(i < j){
            if((num[i] + num[j])> m){
                j--;
            }else if((num[i] + num[j]) < m){
                i++;
            }else{
                List<Integer> reuslt = new ArrayList();
                reuslt.add(num[i]);
                reuslt.add(num[j]);
                resultList.add(reuslt);
                j--;
            }
        }
        return resultList;
    }
}
