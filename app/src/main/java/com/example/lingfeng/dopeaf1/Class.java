package com.example.lingfeng.dopeaf1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lingfeng on 2017/2/18.
 */

public class Class {
    public String courseID;
    public List<String> users;
    public String courseName;
    public int numTasks;
    public double credits;
    public String sectionID;
    public String quarter;
    public List<String> sharedTasks;

    public Class() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Class(String cid, String cname, String sectionID, String quarter, double credits){
        courseID=cid;
        courseName=cname;
        numTasks=0;
        users =new ArrayList<String>();
        this.sectionID=sectionID;
        this.quarter=quarter;
        this.credits=credits;
        sharedTasks = new ArrayList<String>();
    }

    public void addStudents(String studentID){
        if(users==null)
            users =new ArrayList<String>();
        users.add(studentID);
    }

    public boolean dropStudent(String studentID){
        if(users==null)
            return false;
        if(users.contains(studentID))
            users.remove(users.indexOf(studentID));
        else
            return false;
        return true;
    }

    public void addSharedTasks(String task){
        sharedTasks.add(task);
    }


}
