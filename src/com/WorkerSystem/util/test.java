package com.WorkerSystem.util;

import com.WorkerSystem.dao.AdminDAO;
import com.WorkerSystem.dao.impl.AdminDAOimpl;
import com.WorkerSystem.pojo.Staff;

import java.util.*;

public class test {
    public static void main(String[] args) throws Exception {
        AdminDAO adminDAO = new AdminDAOimpl();
        List<Staff> list = adminDAO.GetWorker_inf();

        /*String n1 = "001";
        String n2 = "0a1";

        boolean b1 = n1.matches("[0-9]+");
        boolean b2 = n2.matches("[0-9]+");
        System.out.println(b1);
        System.out.println(b2);*/

        /*String str = "";

        String str2 = "";

        System.out.println(str.equals(str2));*/



        Collections.sort(list, new Comparator<Staff>() {
                    @Override
                    public int compare(Staff o1, Staff o2) {
                        return o2.getAge()-o1.getAge();
                    }//降序
                });

                System.out.println(list);
    }

}
