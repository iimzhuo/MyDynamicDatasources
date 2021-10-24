package com.Re.entity;

import java.util.List;

public class LockWip {
    private Integer id;

    private String no;

    private String status;

    private String siteCode;

    private List<LockWipDetail> lockWipDetailList;

    @Override
    public String toString() {
        return "LockWip{" +
                "id=" + id +
                ", no='" + no + '\'' +
                ", status='" + status + '\'' +
                ", siteCode='" + siteCode + '\'' +
                ", lockWipDetailList=" + lockWipDetailList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public List<LockWipDetail> getLockWipDetailList() {
        return lockWipDetailList;
    }

    public void setLockWipDetailList(List<LockWipDetail> lockWipDetailList) {
        this.lockWipDetailList = lockWipDetailList;
    }
}
