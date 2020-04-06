package com.example.parsaniahardik.json_parse_listview;

public class TennisModel {

    private String name, salary, age, imgURL;

    public String getImgURL(){
        return imgURL;
    }

    public void setImgURL(String imgURL){
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() { return salary; }

    public void setSalary(String salary) { this.salary = salary; }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
