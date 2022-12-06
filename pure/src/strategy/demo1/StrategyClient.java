package strategy.demo1;

import strategy.demo1.impl.OneStrategy;
import strategy.demo1.impl.ThreeStrategy;
import strategy.demo1.impl.TwoStrategy;

/**
 * 定义了算法族，分别封装起来，让它们之间可以相互替换，此模式让算法的变化独立于使用算法的客户。
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context = new Context();
        // 策略一
        context.setStrategy(new OneStrategy());
        context.doSomething();
        // 策略二
        context.setStrategy(new TwoStrategy());
        context.doSomething();
        // 策略三
        context.setStrategy(new ThreeStrategy());
        context.doSomething();
    }
}
