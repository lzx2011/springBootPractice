package com.lzhenxing.myproject.algorithm.interview;

/**
 *   ClassName: MtoNthpower <br/>
 *   Function: m的n次方<br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/14
 */
public class MtoNthPower {

    /**
     * 递归法
     * @param m
     * @param n
     * @return
     */
    public static Long nthPowerRecursion(int m, int n){
        if(n == 0){
            return 1L;
        }
        return m * nthPowerRecursion(m, n-1);
    }

    /**
     * 二分法
     * @param m
     * @param n
     * @return
     */
    public static Long dichotomy(int m, int n){
        if(n == 0){
            return 1L;
        }
        if(n%2 == 0){
            return dichotomy(m, n/2) * dichotomy(m, n/2);
        }else{
            //int 除后是取整的所以可以优化为  m * dichotomy(m, n/2) * dichotomy(m, n/2)
            return m *  dichotomy(m, (n-1)/2) * dichotomy(m, (n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(nthPowerRecursion(3, 3));
        System.out.println(dichotomy(3, 3));
    }

}
