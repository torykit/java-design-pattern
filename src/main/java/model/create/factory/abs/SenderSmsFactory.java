package model.create.factory.abs;

import model.create.factory.base.Sender;
import model.create.factory.base.SmsSender;

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
