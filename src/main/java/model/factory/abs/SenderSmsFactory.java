package model.factory.abs;

import model.factory.base.Sender;
import model.factory.base.SmsSender;

/**
 * 抽象工厂模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class SenderSmsFactory implements Produce {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
