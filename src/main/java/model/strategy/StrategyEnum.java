package model.strategy;

import java.util.function.BinaryOperator;

/**
 * 策略模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public enum StrategyEnum {

    ADD((x,y) -> x + y ),

    SUB((x,y) -> x - y ),
    MUL((x,y) -> x * y );

    private BinaryOperator<Integer> binaryOperator;
    StrategyEnum(BinaryOperator<Integer> binaryOperator){
        this.binaryOperator = binaryOperator;
    }

    public BinaryOperator<Integer> get(){
        return binaryOperator;
    }


}
