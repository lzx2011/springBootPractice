package com.lzhenxing.myproject.designpattern.templatepattern;

import com.lzhenxing.myproject.domain.Request;
import com.lzhenxing.myproject.domain.Result;

/**
 *   ClassName: ConcreteClassB <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2021/1/7
 */
public class ConcreteClassB extends AbstractTemplate<Request, Result>{

    /**
     * param check
     */
    @Override
    public  boolean checkParam(Request param){
        return true;
    }
    /**
     * 处理中
     */
    @Override
    public void processing(Request param, Result result){
        System.out.println("ConcreteClassB processing");
    }
    /**
     * 处理后做什么
     */
    @Override
    public void afterProcess (Result result){
        System.out.println("ConcreteClassB afterProcess");
    }

}
