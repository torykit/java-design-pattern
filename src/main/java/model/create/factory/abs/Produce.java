package model.create.factory.abs;

import model.create.factory.base.Sender;

/**
 * 抽象工厂模式
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public interface Produce {

    /**
     * 生产方法
     * @return
     */
    Sender produce();
}
