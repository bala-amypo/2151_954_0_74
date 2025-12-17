package com.example.demo.entity;
public class studentEntity{
    private Long id;
    private String name;
    private int age;
    private string email;
    public StudentEntity(){

    }
    public StudentEntity(Long id,String name,int age,String email){
        this.id=id;
        this.name=name;
        this.age=age;
        this.email=email;
    }
    public Long setId(){
        return id;
    }
    public void getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getEmail(){
        return email;
    }
    }