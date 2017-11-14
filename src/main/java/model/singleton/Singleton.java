package model.singleton;

/**
 * 单列
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }



}
