package model.factory;

import model.factory.base.MailSender;
import model.factory.base.Sender;
import model.factory.base.SmsSender;

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
