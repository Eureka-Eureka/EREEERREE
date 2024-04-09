package com.WorkerSystem.pojo;

public class Staff_Account {
    //存放管理员账户的类
    private int account;
    private String password;


    public Staff_Account() {
    }

    public Staff_Account(int account, String password) {
        this.account = account;
        this.password = password;
    }

    /**
     * 获取
     * @return account
     */
    public int getAccount() {
        return account;
    }

    /**
     * 设置
     * @param account
     */
    public void setAccount(int account) {
        this.account = account;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "Staff{account = " + account + ", password = " + password + "}";
    }
}
