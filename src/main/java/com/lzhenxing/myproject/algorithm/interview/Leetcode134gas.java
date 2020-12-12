package com.lzhenxing.myproject.algorithm.interview;

/**
 *   ClassName: Leetcode134gas <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/18
 */
public class Leetcode134gas {

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        //start记录开始的位置
        //sum记录总得剩余油量
        //total第i次是否到达第i+1处加油站
        //当i的total《0时发现到达不了i+1处则直接把记录位置挪到i+1处因为前面不可能会条件成立
        int start = 0, sum = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);
            sum += (gas[i] - cost[i]);
            if (total < 0) {
                start = i + 1;
                //初始化本次的剩余油量
                total = 0;
            }
        }
        if (sum < 0) {
            return -1;
        } else {
            return start;
        }
    }

    public static void main(String[] args) {
        int[] m = {1,2,3,4,5};
        int[] b = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(m, b));
        //System.out.println("sdf".substring(0, 2));
    }
}
