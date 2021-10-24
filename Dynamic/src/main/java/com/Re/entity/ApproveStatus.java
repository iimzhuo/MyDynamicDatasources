package com.Re.entity;

public class ApproveStatus {
    private Integer id;

    private String status;

    private ApprovePerson person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ApprovePerson getPerson() {
        return person;
    }

    public void setPerson(ApprovePerson person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "ApproveStatus{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", person=" + person +
                '}';
    }
}
