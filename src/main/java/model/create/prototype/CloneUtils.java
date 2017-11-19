package model.create.prototype;

import java.io.*;

/**
 * 原型模式 工具类(深度拷贝)
 * @author zhaozhen
 * @CreateDate 2017/11/18
 */
public class CloneUtils {


    public static  <T extends Serializable> T clone(T obj) {
        T newObj = null;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            ObjectOutputStream obs = new ObjectOutputStream(out);
            obs.writeObject(obj);
            obs.close();

            ByteArrayInputStream ins = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(ins);
            newObj = (T) ois.readObject();
            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newObj;
    }



}
