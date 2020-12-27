package com.lzhenxing.myproject.algorithm.interview;

import java.util.ArrayList;
import java.util.List;

/**
 *   ClassName: PerfectSquare <br/>
 *   Function:  by meituan <br/>
 *   一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，
 *   请问该数是多少？
 *
 *   x+100=m^2
 *   x+100+168=n^2
 *   n^2 - m^2 = 168
 *
 * @author zhenxing.liu
 * @date 2020/12/23
 */
public class PerfectSquare {

    /**
     * 找出最小的满足条件的 x
     * @return
     */
    public static Integer cal(){
        for(int m = 1; m < 169; m++){
            for(int n = 1; n < 169; n++){
                if(n*n - m*m == 168){
                    return m*m - 100;
                }
            }
        }
        return null;
    }

    /**
     * 找出所有的结果
     * @return
     */
    public static List<Integer> allResult(){
        List<Integer> result = new ArrayList<>();
        for(int m = 1; m < 169; m++){
            for(int n = 1; n < 169; n++){
                if(n*n - m*m == 168){
                    result.add(m*m - 100);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cal());
        System.out.println(allResult());
    }

}
