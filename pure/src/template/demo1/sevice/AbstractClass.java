package template.demo1.sevice;

public abstract class AbstractClass {
    final void templateMethod() {
        if (this.status() != 0) {

            doString();
        }
        method1();
        System.out.println("中途休息。。。");
        method2();
    }

    protected abstract void method1();

    protected abstract void method2();
    
    // 钩子
    int status() {
        return 0;
    }

    // 钩子方法
    void doString() {
        System.out.println("触发钩子");
    }

}
