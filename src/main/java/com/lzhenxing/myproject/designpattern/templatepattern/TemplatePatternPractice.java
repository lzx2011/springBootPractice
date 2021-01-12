package com.lzhenxing.myproject.designpattern.templatepattern;

import com.lzhenxing.myproject.domain.Request;
import com.lzhenxing.myproject.domain.Result;

/**
 *   ClassName: TemplatePatternPractice <br/>   Function: <br/>
 *
 * @author zhenxing.liu
 * @date 2021/1/7
 */
public class TemplatePatternPractice {

    public static void main(String[] args) {
        Request request = new Request();
        Result result = new Result();
        AbstractTemplate templateA = new ConcreteClassA();
        templateA.process(request, result);

        AbstractTemplate templateB = new ConcreteClassB();
        templateB.process(request, result);
    }
}
