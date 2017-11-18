package model.create.factory.abs;

import model.create.factory.base.MailSender;
import model.create.factory.base.Sender;

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
