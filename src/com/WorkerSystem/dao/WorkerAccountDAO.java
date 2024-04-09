package com.WorkerSystem.dao;

import com.WorkerSystem.pojo.Staff;
import com.WorkerSystem.pojo.Staff_Account;

import java.util.List;

public interface WorkerAccountDAO {

    public List<Staff_Account> GetAccount() throws Exception;

    public void ModAccount(Staff_Account staff_account) throws Exception;

    public List<Staff> GetStaff_inf();


}
