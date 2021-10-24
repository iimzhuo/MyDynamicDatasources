package com.Re.entity;

public class LockProcess {
    private Integer id;

    private String lockno;

    private String status;

    private LockWip lockWip;

    public LockWip getLockWip() {
        return lockWip;
    }

    public void setLockWip(LockWip lockWip) {
        this.lockWip = lockWip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLockno() {
        return lockno;
    }

    public void setLockno(String lockno) {
        this.lockno = lockno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LockProcess{" +
                "id=" + id +
                ", lockno='" + lockno + '\'' +
                ", status='" + status + '\'' +
                ", lockWip=" + lockWip +
                '}';
    }
}
