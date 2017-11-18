package model.create;

import model.create.builder.Builder;
import model.create.factory.SenderCommonFactory;
import model.create.factory.SenderMultiFactory;
import model.create.factory.SenderStaticFactory;
import model.create.factory.abs.Produce;
import model.create.factory.abs.SenderMailFactory;
import model.create.factory.base.Sender;
import model.create.singleton.Singleton;

import java.util.List;

/**
 * 创造性模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class MainCreateModel {

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

        /**
         * 单列模式(静态类方式)
         * 静态类方式的缺点: 1. 静态类不能实现接口
         *      2. 单例可以被延迟初始化，静态类一般在第一次加载是初始化。
         *      3. 单例类可以被继承，他的方法可以被覆写。但是静态类内部方法都是static，无法被覆写。
         */
        singletonDemo();

        /**
         * 建造者模式:将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
         *      所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
         *      因此，是选择工厂模式还是建造者模式，依实际情况而定。
         */
        builderDemo();
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

    /**
     * 单列模式 演示
     */
    private static void singletonDemo(){
        Singleton instance = Singleton.getInstance();
        System.out.print("单列模式下: ");
        instance.say();
    }

    /**
     * 建造者模式 演示
     */
    private static void builderDemo(){
        Builder builder = new Builder();
        List<Sender> senders = builder.produceMailSender(2);
        System.out.print("建造者模式下: ");
        for (Sender sender : senders) {
            sender.say();
        }
    }

}
