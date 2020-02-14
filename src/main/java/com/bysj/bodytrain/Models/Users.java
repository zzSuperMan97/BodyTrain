package com.bysj.bodytrain.Models;

public class Users extends BaseModel {
    /**
     * 会员名
     */
    private String account;
    /**
     * 姓名
     */
    private String userName;
    /**
     * 年龄
     */
    private int age;
    /**
     * 性别，0为女， 1为男
     */
    private int sex;
    /**
     * 手机号
     */
    private long phone;
    /**
     * 家庭住址
     */
    private String address;
    /**
     * 密码
     */
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
