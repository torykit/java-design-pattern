package model.create.builder;

import model.create.factory.base.MailSender;
import model.create.factory.base.Sender;
import model.create.factory.base.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * @author zhaozhen
 * @CreateDate 2017/11/18
 */
public class Builder {


    private List<Sender> senderList = new ArrayList<>();

    public List<Sender> produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            senderList.add(new SmsSender());
        }
        return senderList;
    }

    public List<Sender> produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            senderList.add(new MailSender());
        }
        return senderList;
    }

}
