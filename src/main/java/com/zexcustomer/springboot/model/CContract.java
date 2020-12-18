package com.zexcustomer.springboot.model;

public class CContract implements java.io.Serializable{
    private Integer id;

    private String contractnumber;   //合同编程
    private String contractname;    //合同名称
    private Integer businesstype;  //业务类型
    private String businessname;  //业务名称
    private String scanning;     //扫描件

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(String contractnumber) {
        this.contractnumber = contractnumber;
    }

    public String getContractname() {
        return contractname;
    }

    public void setContractname(String contractname) {
        this.contractname = contractname;
    }

    public Integer getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(Integer businesstype) {
        this.businesstype = businesstype;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getScanning() {
        return scanning;
    }

    public void setScanning(String scanning) {
        this.scanning = scanning;
    }
}
