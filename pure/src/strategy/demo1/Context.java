package strategy.demo1;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.execute();
    }
}
