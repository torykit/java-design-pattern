package model.factory;

import model.factory.abs.Produce;
import model.factory.abs.SenderMailFactory;
import model.factory.base.Sender;

/**
 * 工厂模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class MainFactory {

    public static void main(String[] args) {
        /**
         * 工厂模式适合：
         *      凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。
         *      在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类。
         *      所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
         *
         * 工厂模式的问题:
         *      类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
         */
        commonFactoryDemo();
        multiFactoryDemo();
        staticFactoryDemo();

        /**
         * 抽象工厂模式:这个模式的好处就是，如果你现在想增加一个功能：
         *      发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，
         *      无需去改动现成的代码。这样做，拓展性较好！
         */
        abstractFactoryDemo();

    }

    /**
     * 简单工厂模式 演示
     */
    private static void commonFactoryDemo() {
        SenderCommonFactory senderCommonFactory = new SenderCommonFactory();
        Sender sender = senderCommonFactory.produce("mail");
        System.out.print("简单工厂模式下: ");
        sender.say();
    }

    /**
     * 多个工厂方法模式 演示
     */
    private static void multiFactoryDemo(){
        SenderMultiFactory senderMultiFactory = new SenderMultiFactory();
        Sender sender = senderMultiFactory.produceMail();
        System.out.print("多个工厂方法模式下: ");
        sender.say();
    }

    /**
     * 静态工厂方法模式 演示
     */
    private static void staticFactoryDemo(){
        Sender sender = SenderStaticFactory.produceMail();
        System.out.print("静态工厂方法模式下: ");
        sender.say();
    }

    /**
     * 抽象工厂模式 演示
     */
    private static void abstractFactoryDemo(){
        Produce produce = new SenderMailFactory();
        Sender sender = produce.produce();
        System.out.print("抽象工厂模式下: ");
        sender.say();
    }

}
