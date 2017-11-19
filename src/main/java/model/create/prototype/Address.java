package model.create.prototype;

import java.io.Serializable;

/**
 * @author zhaozhen
 * @CreateDate 2017/11/18
 */
public class Address implements Serializable{

    private static final long serialVersionUID = 5160363821318030200L;
    private String address;

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.address;
    }
}
