package com.lzhenxing.myproject.algorithm.interview;

import java.util.Arrays;

/**
 *   ClassName: HeapSort <br/>
 *   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/12/16
 */
public class HeadSort {

    public static int[] heapSort(int[] arr){
        if(arr == null){
            return null;
        }
        int len = arr.length;
        if(len == 1){
            return arr;
        }
        //init big heap
        for(int i = len/2 -1; i >= 0; i--){
            adjustHeap(arr, i, len);
        }
        //adjust heap
        for(int j = len -1; j > 0; j--){
            swap(arr, 0, j);
            adjustHeap(arr, 0, j);
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 调整大顶堆，注意这里只调整了一次，使用的前提是大顶堆已经构建好了
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int[] arr, int i, int length){
        int temp = arr[i];
        //2*i+1 是左子节点的下标
        for(int k = 2*i+1; k < length; k = 2*k+1) {
            //找到左右子节点大的那个
            if (k+1 < length && arr[k] < arr[k+1]) {
                k++;
            }
            if(arr[k] > arr[i]){
                arr[i] = arr[k];
                i = k;
            } else{
                break;
            }
            arr[k] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,7,8};
        System.out.println(Arrays.toString(heapSort(arr)));
    }
}
