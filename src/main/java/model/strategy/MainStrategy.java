package model.strategy;


/**
 * 策略模式 lambda
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class MainStrategy {

    public static void main(String[] args) {

        StrategyContext context = new StrategyContext(StrategyEnum.ADD);
        Integer result = context.getResult(2, 3);
        System.out.println(result);

    }

}
