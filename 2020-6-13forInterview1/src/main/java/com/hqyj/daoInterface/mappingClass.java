package com.hqyj.daoInterface;

import java.util.Date;

public class mappingClass//此类映射数据库中的user类
{
    private int id;
    private Date birthday;
    private char sex;
    private  String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "mappingClass{" +
                "id=" + id +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                '}';
    }
}
