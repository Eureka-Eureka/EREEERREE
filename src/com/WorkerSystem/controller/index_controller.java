package com.WorkerSystem.controller;

import com.WorkerSystem.Main;
import javafx.fxml.FXML;

public class index_controller {

    @FXML
    public void initialize(){
        
    }

    @FXML
    public void toAdminLogin() {
        Main.changeView("view/AdminLogin.fxml");
    }

    @FXML
    public void toStaffLogin() {
        Main.changeView("view/StaffLogin.fxml");
    }
}
