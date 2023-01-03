package singleton.demo1.main;

import singleton.demo1.service.Singleton;

/**
 * 单例模式
 */
public class doRun {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            System.out.println(Singleton.getInstance().toString());
        });
        Thread threadTne =  new Thread(() -> {
            System.out.println(Singleton.getInstance().toString());
        });
        threadTne.start();
        threadOne.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Singleton.getInstance());
        }
    }
}
