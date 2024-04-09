package com.WorkerSystem.controller;

import com.WorkerSystem.Main;
import com.WorkerSystem.dao.AdminDAO;
import com.WorkerSystem.dao.impl.AdminDAOimpl;
import com.WorkerSystem.pojo.Admin;
import com.WorkerSystem.util.Stringutil;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import java.util.List;



public class AdminLogin_controller {

    @FXML
    private TextField account;

    @FXML
    private PasswordField password;

    @FXML
    private Label errorInfo;

    @FXML
    public void AdminLogin() throws Exception {
        String accountText = account.getText();
        String passwordText = password.getText();

        if(Stringutil.isEmpty(accountText)){
            errorInfo.setText("当前未输入账号，请输入！！！");
            errorInfo.setVisible(true);
            return;
        }

        if(Stringutil.isEmpty(passwordText)){
            errorInfo.setText("当前未输入密码，请输入！！！");
            errorInfo.setVisible(true);
            return;
        }

        //获取数据
        AdminDAO adminDAO = new AdminDAOimpl();
        List<Admin> list=  adminDAO.GetAccount();
        boolean flag = false;

        for (Admin admin:list) {
            if(admin.getAccount().equals(accountText)){
                if(admin.getPassword().equals(passwordText)){
                    flag = true;
                    break;
                }
                break;
            }
        }

        if(flag){
            Main.changeView("view/AdminManageSystem.fxml");
        }else{
            errorInfo.setText("账号或密码出错！！！");
            errorInfo.setVisible(true);
        }
    }
}
