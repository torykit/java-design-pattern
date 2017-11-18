package model.create.factory;

import model.create.factory.base.MailSender;
import model.create.factory.base.Sender;
import model.create.factory.base.SmsSender;

/**
 * 简单工厂模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class SenderCommonFactory {

    public Sender produce(String type) {
        switch (type.toLowerCase()) {
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                throw new RuntimeException("type input error!");
        }
    }

}
