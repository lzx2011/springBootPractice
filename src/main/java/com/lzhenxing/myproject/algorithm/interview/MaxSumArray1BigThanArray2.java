package com.lzhenxing.myproject.algorithm.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *   ClassName: MaxSumArray1BigThanArray2 <br/>
 *   Function:  by Microsoft China<br/>
 *   两个数组A和B的长度相同，找出 A[i] > B[i] 的最多的A的一个排序结果，保证B的顺序不变
 *   A=[2,5,9,1]
 *   B=[6,3,7,4]
 *
 *   比如这个结果是 A=[2,9,1,5]
 *
 *   分析：
 *   对B排序获得两个新数组
 *   B1=[3,4,6,7]
 *
 *   B2[1]=0 没被使用
 *
 *   贪心策略：对A遍历，2由于不大于任何B1中的数，根据贪心策略 2 放在 B1中 7 的位置最好；5 放在刚好比4大的位置上最好,已经被放了的位置就不要再放了
 *   注意：因为要得出A的结果时保证B的顺序不变，这里对B已经排序了，所以要记录B之前的位置 （这里可以用索引倒序或者对象来存储值和下标）
 *   结果是 A=[2,9,1,5]
 *
 * @author zhenxing.liu
 * @date 2020/12/23
 */
public class MaxSumArray1BigThanArray2 {

    public static List<Integer> findOneMaxCount(List a, List b){

        List<Integer> result = new ArrayList<>();


        return result;
    }




    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(2,5,9,1));
        List<Integer> b = new ArrayList<>(Arrays.asList(6,3,7,4));
        System.out.println(findOneMaxCount(a, b));
    }
}
