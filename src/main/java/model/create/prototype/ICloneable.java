package model.create.prototype;

import java.io.Serializable;

/**
 * @author zhaozhen
 * @CreateDate 2017/11/18
 */
public interface ICloneable extends Cloneable {

    /**
     * 深度拷贝
     * @param object
     * @param <T>
     * @return
     */
    <T extends Serializable> T clone(T object);
}
