package model.create.factory;

import model.create.factory.base.MailSender;
import model.create.factory.base.Sender;
import model.create.factory.base.SmsSender;

/**
 * 多个工程模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class SenderMultiFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }

}
