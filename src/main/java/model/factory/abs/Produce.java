package model.factory.abs;

import model.factory.base.Sender;

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
