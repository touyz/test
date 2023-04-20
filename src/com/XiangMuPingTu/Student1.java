package com.XiangMuPingTu;

public class Student1 {
    private String name;
    private String sex;

    public Student1() {
    }

    public Student1(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
        
    }

}
