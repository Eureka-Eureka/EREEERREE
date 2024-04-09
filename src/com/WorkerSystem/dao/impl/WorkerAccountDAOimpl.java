package com.WorkerSystem.dao.impl;

import com.WorkerSystem.dao.WorkerAccountDAO;
import com.WorkerSystem.pojo.Staff;
import com.WorkerSystem.pojo.Staff_Account;
import com.WorkerSystem.util.jdbcConn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class WorkerAccountDAOimpl implements WorkerAccountDAO {


    @Override
    public List<Staff_Account> GetAccount() throws Exception {
        Connection conn = jdbcConn.getConnection();
        List<Staff_Account> list = new ArrayList<>();


        String sql = "select * from staff_account";
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()){
            Staff_Account staff_account = new Staff_Account(rs.getInt("account"),rs.getString("password"));

            list.add(staff_account);
        }

        conn.close();

        return list;
    }

    @Override
    public void ModAccount(Staff_Account staff_account) throws Exception {
        Connection conn = jdbcConn.getConnection();
        String password = staff_account.getPassword();

        String sql = "update staff_account set password = ?";
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setString(1,password);
        pstm.executeUpdate();

        conn.close();
    }

    @Override
    public List<Staff> GetStaff_inf() {
        return null;
    }
}
