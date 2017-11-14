package model.factory.base;

/**
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class SmsSender implements Sender {
    @Override
    public void say() {
        System.out.println("Sms sender!!");
    }
}
