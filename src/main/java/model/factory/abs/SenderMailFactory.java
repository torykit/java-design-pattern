package model.factory.abs;

import model.factory.base.MailSender;
import model.factory.base.Sender;

/**
 * 抽象工厂模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class SenderMailFactory implements Produce {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
