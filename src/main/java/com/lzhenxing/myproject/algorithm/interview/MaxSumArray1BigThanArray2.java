package com.lzhenxing.myproject.algorithm.interview;

import java.util.Arrays;

/**
 *   ClassName: MaxSumArray1BigThanArray2 <br/>
 *   Function:  by Microsoft China<br/>
 *   两个数组A和B的长度相同，找出 A[i] > B[i] 数量最多的A的一个排序结果，保证A对应B的顺序不变
 *   A=[2,5,9,1]
 *   B=[6,3,7,4]
 *
 *   因为A[i] > B[i]的数共有两个，比如A的一个结果可以是 A=[9,1,2,5]
 *
 *   分析：
 *   对B排序获得新数组：bSort=[3,4,6,7]，被使用过后就把值改为 -1 (或者其他标志性的值)
 *
 *   bSort 相对于B数组的顺序索引数组：bSortIndex=[1,3,0,2]
 *
 *   贪心策略：
 *   1. 对A遍历和 bSort 倒着对比，2由于不大于任何bSort中的数，根据贪心策略 2 放在 bSort 中 7 的位置最好，再根据 bSortIndex 数组就可以找到 2 应该放的位置，将 7的位置置为 -1；
 *   2. 5 放在刚好比4大的位置上最好,把 bSort 的值置为-1
 *
 *   注意：因为要得出A的结果对应B的顺序不变，这里对B已经排序了，所以要记录B之前的位置 （这里可以用索引数组记录或者对象来存储值和下标）
 *
 *   结果是 A=[9,1,2,5]
 *
 * @author zhenxing.liu
 * @date 2020/12/23
 */
public class MaxSumArray1BigThanArray2 {

    public static int[] findOneMaxCount(int[] a, int[] b){
        if(a.length == 0){
            return null;
        }
        int[] bSort = Arrays.copyOf(b, b.length);
        Arrays.sort(bSort);
        System.out.println("bSort: "  + Arrays.toString(bSort));
        int[] bSortIndex = new int[b.length];
        for(int i = 0; i < bSort.length; i++){
            for(int j = 0; j < b.length; j++){
                if(bSort[i] == b[j]){
                    bSortIndex[i] = j;
                }
            }
        }
        int[] result = new int[a.length];
        System.out.println("bSortIndex: " + Arrays.toString(bSortIndex));
        for(int i = 0 ; i < a.length; i++){
            boolean flag = false;
            for(int j = bSort.length -1; j >= 0; j--){
                if(a[i] > bSort[j] && bSort[j] != -1){
                    result[bSortIndex[j]] = a[i];
                    bSort[j] = -1;
                    flag = true;
                    break;
                }
            }
            //a数组都比b小时
            if(!flag){
                for(int k = bSort.length -1; k >= 0; k--){
                    if(bSort[k] != -1){
                        result[bSortIndex[k]] = a[i];
                        bSort[k] = -1;
                        break;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {2,5,9,1};
        int[] b = {6,3,7,4};
        System.out.println("result: " + Arrays.toString(findOneMaxCount(a, b)));
    }
}
