package ooplab7;
//talking about student?
//1.student ID
//2.Name
//3.person ID
//4.Address

import ooplab6.StringCompare;

public class studont {
    //properties of student class
    private String id;
    private String name;
    private String pid;
    private String address;
    //Constructor
    //default constructor
    public  studont() {}
    //create by own//
    public studont (String id, String n,String pid, String a){
        //assing data to class properties// //
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.address = a;
    }
    //getter and setter methods

    @Override
    public String toString() {
        return "studont{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
