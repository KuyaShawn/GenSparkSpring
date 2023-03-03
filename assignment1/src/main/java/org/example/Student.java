package org.example;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> ph;

    private Address add;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + ph +
                ", add=" + add +
                '}';
    }

    public void studentInfo() {
        System.out.println(toString() + "\n" + add + "\n" + ph);
    }
}
