package model.create.prototype;

import java.io.Serializable;

/**
 * 只实现了浅拷贝的对象
 * @author zhaozhen
 * @CreateDate 2017/11/18
 */
public class Person implements Serializable,Cloneable {

    private static final long serialVersionUID = 4278472815465619346L;
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 浅拷贝
     * @return
     */
    @Override
    public Person clone(){
        Person newP = null;
        try {
            newP = (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newP;
    }



}
