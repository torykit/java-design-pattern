package model.factory;

import model.factory.base.MailSender;
import model.factory.base.Sender;
import model.factory.base.SmsSender;

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
