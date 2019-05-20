package com.lut.wlw;

/**
 * @Classname OperationAdd
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/4 15:42
 */
public class OperationAdd extends Operation {
    public double getResult() {
        double result = 0;
        result = getNumberA() + getNumberB();
        return result;
    }
}