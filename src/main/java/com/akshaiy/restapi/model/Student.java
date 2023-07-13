package com.akshaiy.restapi.model;

import jakarta.persistence.*;

@Entity
@Table(name="students_info")
public class Student {
    private String name;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incrementing the ID (uniqueness)
    private String rno;
    private int age;

    public Student() {
    }

    public Student(String name, String rno, int age) {
        this.name = name;
        this.rno = rno;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getRno() {
        return rno;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
