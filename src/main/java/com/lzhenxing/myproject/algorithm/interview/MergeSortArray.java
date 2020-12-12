package com.lzhenxing.myproject.algorithm.interview;

/**
 *   ClassName: MergeSortArray <br/>
 *   Function: 合并有序数组<br/>
 *   [1, 2,2, 5]
 *   [3, 4, 7, 8]
 *
 *
 * @author zhenxing.liu
 * @date 2020/12/12
 */
public class MergeSortArray {

    public static int[] mergeSortArray(int[] a, int[] b){
        int length1 = a.length, length2 = b.length;
        if(a == null && b == null){
            return null;
        }
        int[] merge = new int[length1 + length2];
        int i = 0, j = 0, k = 0;
        while(i < length1 && j < length2){
            if(a[i] <= b[j]){
                merge[k++] = a[i++];
            }else{
                merge[k++] = b[j++];
            }
        }
        if(i < length1){
            for(; i < length1; i++){
                merge[k++] = a[i];
            }
        }
        if(j < length2){
            for(; j < length2; j++){
                merge[k++] = b[j];
            }
        }
        return merge;
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 2, 5};
        int[] b = {3, 4, 7, 8, 9};
        int[] merge = mergeSortArray(a, b);
        for(int i = 0; i < merge.length; i++){
            System.out.println(merge[i]);
        }
    }
}
