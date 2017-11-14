package model.strategy;

import java.util.function.BinaryOperator;

/**
 * 策略模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class StrategyContext {

    private BinaryOperator<Integer> strategy;
    public StrategyContext(StrategyEnum strategyEnum) {
        this.strategy = strategyEnum.get();
    }

    public Integer getResult(Integer x,Integer y){
        return strategy.apply(x, y);
    }


}
