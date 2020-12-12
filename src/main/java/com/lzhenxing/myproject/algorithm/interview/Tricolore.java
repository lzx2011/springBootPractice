package com.lzhenxing.myproject.algorithm.interview;

/**
 *   ClassName: Tricolore <br/>
 *   Function: 三色球<br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/19
 */
public class Tricolore {

    public static int getMaxTicket(int a, int b, int c){

        int min = Math.min(a, Math.min(b, c));
        int ticket = min;
        a -= min;
        b -= min;
        c -= min;
        if(a == 0){
            return ticket += Math.min(b/3, c/2);
        }
        if(b == 0){
            return ticket += Math.min(c/3, a/2);
        }
        if(c == 0){
            return ticket += Math.min(a/3, b/2);
        }
        return ticket;
    }

    public static void main(String[] args) {
        System.out.println(getMaxTicket(1,7,5));
    }
}
