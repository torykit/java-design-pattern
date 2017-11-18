package model.create.factory.base;

/**
 * @author zhaozhen
 * @CreateDate 2017/11/13
 */
public class MailSender implements Sender {
    @Override
    public void say() {
        System.out.println("mail send!!");
    }
}
