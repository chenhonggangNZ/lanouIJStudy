package com.lanou3g.yesterday;

import com.lanou3g.yesterday.toDay.Person;

public class Student extends Person<Person> {
    private int sId;
    private String gender;
    private int age;
    public Student(){

    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
