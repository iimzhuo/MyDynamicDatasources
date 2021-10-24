package com.Re.entity;

public class LockWipDetail {
    private Integer id;

    private String sn;

    private String wipStatus;

    private Integer wipId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getWipStatus() {
        return wipStatus;
    }

    public void setWipStatus(String wipStatus) {
        this.wipStatus = wipStatus;
    }

    public Integer getWipId() {
        return wipId;
    }

    public void setWipId(Integer wipId) {
        this.wipId = wipId;
    }

    @Override
    public String toString() {
        return "LockWipDetail{" +
                "id=" + id +
                ", sn='" + sn + '\'' +
                ", wipStatus='" + wipStatus + '\'' +
                ", wipId=" + wipId +
                '}';
    }
}
