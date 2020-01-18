package com.wdjr.springboot.entities;

public class Company {
    private Integer id;
    private String companyName;

    public Company() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Company(Integer id, String companyName) {
        this.companyName = companyName;
        this.id = id;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }



    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ",companyName='" + companyName + '\'' +
                '}';
    }
}
