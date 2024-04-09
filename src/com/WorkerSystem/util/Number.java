package com.WorkerSystem.util;

import com.WorkerSystem.dao.AdminDAO;
import com.WorkerSystem.dao.impl.AdminDAOimpl;
import com.WorkerSystem.pojo.Staff;

import java.util.List;

public class Number {
    public static int isUnique(String new_id) throws Exception {
        //1->不唯一   2->含有非法字符   0->合法

        AdminDAO adminDAO = new AdminDAOimpl();
        List<Staff> list = adminDAO.GetWorker_inf();

        if(!(new_id.matches("[0-9]+"))){
            return 2;
        }

        for (Staff staff : list) {
            if(staff.getID().equals(new_id)){
                return 1;
            }
        }

        return 0;
    }
}
