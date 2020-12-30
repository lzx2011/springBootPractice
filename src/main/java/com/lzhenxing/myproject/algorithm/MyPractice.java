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

    public static void testJson(){
        String config = "\"EXT_NOTICE_CONFIG\":\"{\"ACCEPT\":\"2088000234SC_ACCEPT000001|ONLINE\",\"FINISH_SUCC\":\"2088000234SC_SUCCESS000001|ONLINE\",\"REFUNDED\":\"2088001477OS13019|ONLINE\",\"WAIT_PAY\":\"2088001477OS99671|ONLINE\",\"REFUND_TIMEOUT\":\"2088001477OS96197|ONLINE\",\"FINISH_FAIL\":\"2088000234SC_FAIL000001|ONLINE\",\"WAI_REFUND\":\"2088001477OS18439|ONLINE\"}\"";
        //JSONObject.parseObject(config);
    }

    public static void main(String[] args) {
        //practice();
        System.out.println("smfd".substring(1));
        //resize();
    }
}
