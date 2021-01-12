package com.lzhenxing.myproject.designpattern.templatepattern;

/**
 *   ClassName: AbstractTemplate <br/>
 *   Function: 模板模式-抽象模板父类<br/>
 *
 * @author zhenxing.liu
 * @date 2021/1/7
 */
public abstract class AbstractTemplate<T, S> {

    /**
     * final 可以防止被串改
     */
    public final void process(T param, S result){
        if(!checkParam(param)){
            return;
        }
        this.processing(param, result);
        this.afterProcess(result);
    }
    /**
     * param check
     */
    public abstract boolean checkParam(T param);
    /**
     * 处理中
     */
    public abstract void processing(T param, S result);
    /**
     * 处理后做什么
     */
    public abstract void afterProcess (S result);


}
