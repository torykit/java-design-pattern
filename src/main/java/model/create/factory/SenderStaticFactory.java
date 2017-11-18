package model.create.factory;

import model.create.factory.base.MailSender;
import model.create.factory.base.Sender;
import model.create.factory.base.SmsSender;

/**
 * 静态工厂方法模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class SenderStaticFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
