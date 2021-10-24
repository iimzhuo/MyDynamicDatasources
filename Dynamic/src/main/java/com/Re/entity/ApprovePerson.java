package com.Re.entity;

public class ApprovePerson {
    private Integer id;

    private String personName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "ApprovePerson{" +
                "id=" + id +
                ", personName='" + personName + '\'' +
                '}';
    }
}
