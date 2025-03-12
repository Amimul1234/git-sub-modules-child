package com.rahi.dto;

public class TestDto {
    public TestDto() {
    }

    public TestDto(String name, String age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private String name;
    private String age;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
