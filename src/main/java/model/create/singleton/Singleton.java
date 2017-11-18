package model.create.singleton;

/**
 * 单列类(内部类方式)
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonFactory {
        private static Singleton singleton = new Singleton();
        private static void reload(){
            singleton = new Singleton();
        }
    }

    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }

    public static void reload(){
        SingletonFactory.reload();
    }


    public void say(){
        System.out.println("singletion say()");
    }

}
