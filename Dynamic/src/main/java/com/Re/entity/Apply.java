package com.Re.entity;

import java.util.List;

public class Apply {
    private Integer id;

    private Product product;

    private String  applyDetail;

    private List<ApproveStatus> personList;

    private List<LockProcess> processList;

    public List<LockProcess> getProcessList() {
        return processList;
    }

    public void setProcessList(List<LockProcess> processList) {
        this.processList = processList;
    }

    public List<ApproveStatus> getPersonList() {
        return personList;
    }

    public void setPersonList(List<ApproveStatus> personList) {
        this.personList = personList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getApplyDetail() {
        return applyDetail;
    }

    public void setApplyDetail(String applyDetail) {
        this.applyDetail = applyDetail;
    }

}
