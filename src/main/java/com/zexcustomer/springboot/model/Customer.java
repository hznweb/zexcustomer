package com.zexcustomer.springboot.model;

import java.util.Date;

public class Customer implements java.io.Serializable {
    private Integer id;
    private String company;   //公司全称
    private String address;   //公司地址
    private Date estime;     //成立时间
    private String legal_person;//法人
    private String contacts;   //联系人
    private String phone ;//联系电话
    private String connumber;  //合同编号
    private String person_c;   //客户负责人

    private CContract ccontract;
    private Admin creator;

    public Customer(){

    }

    public Customer (Integer id){
        super();
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEstime() {
        return estime;
    }

    public void setEstime(Date estime) {
        this.estime = estime;
    }

    public String getLegal_person() {
        return legal_person;
    }

    public void setLegal_person(String legal_person) {
        this.legal_person = legal_person;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConnumber() {
        return connumber;
    }

    public void setConnumber(String connumber) {
        this.connumber = connumber;
    }

    public String getPerson_c() {
        return person_c;
    }

    public void setPerson_c(String person_c) {
        this.person_c = person_c;
    }

    public Admin getCreator() {
        return creator;
    }

    public void setCreator(Admin creator) {
        this.creator = creator;
    }

    public CContract getCcontract() {
        return ccontract;
    }

    public void setCcontract(CContract ccontract) {
        this.ccontract = ccontract;
    }

    /*重写hashCode方法，当通过集合判断对象是否相等时，必须重写该方法*/
    @Override
    public int hashCode(){
        final int prime=31;
        int result=1;
        result=prime*result+((id==null) ?0 :id.hashCode());
        return result;
    }

    /*重写equals方法，让对象能通过该方法直接判断是否相等
     * 以对象标识符判断是否相等
     */
    @Override
    public boolean equals(Object object){
        if (this==object){
            return true;
        }
        if (this==null){
            return false;
        }
        if (object.getClass()==Customer.class){
            Customer cusEquals=(Customer) object;
            if (cusEquals.id==null){
                return false;
            }
            if (this.getId()==null){
                return false;
            }
            return cusEquals.getId()==this.getId().intValue();
        }

        return false;

    }


}
