package com.lut.wlw;

/**
 * @Classname Factory
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/4 15:50
 */
public class Factory {
    public static Operation creatOperation(String opt){
        Operation operation =null;
        if ("+".equals(opt)) {
            operation = new OperationAdd();

        }
        return  operation;
    }
}
