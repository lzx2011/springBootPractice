package com.lzhenxing.myproject.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 *   ClassName: MyPractice <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2020/11/21
 */
public class MyPractice {


    public static void practice(){
        int oldCapacity = 3;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);
    }

    public static void resize(){
        List<Integer> list = new ArrayList<>(10);
        System.out.println("origin:" + list.size());
        for(int i = 0; i < 12; i++){
            list.add(i);
        }
        System.out.println("after:" + list.size());
    }

    public static void main(String[] args) {
        //practice();
        System.out.println("smfd".substring(1));
        //resize();
    }
}
