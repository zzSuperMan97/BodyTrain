package com.bysj.bodytrain.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class Users extends BaseModel {

    /**
     * 会员名
     */
    @Column(name = "account")
    private String account;
    /**
     * 姓名
     */
    @Column(name = "userName")
    private String userName;
    /**
     * 年龄
     */
    @Column(name = "age")
    private int age;
    /**
     * 性别，0为女， 1为男
     */
    @Column(name = "sex")
    private int sex;
    /**
     * 手机号
     */
    @Column(name = "phone")
    private long phone;
    /**
     * 家庭住址
     */
    @Column(name = "address")
    private String address;
    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
