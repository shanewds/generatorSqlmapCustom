package com.syiaas.pojo;

public class Pavilioninfo {
    private Long id;

    private String name;

    private Long exhibitionid;

    private Long matchid;

    private Integer exhibitorsnum;

    private Integer peoplenum;

    private Double area;

    private Double netarea;

    private String contacts;

    private Long telephone;

    private String email;

    private Double leftdownx;

    private Double leftdowny;

    private Double leftupx;

    private Double leftupy;

    private Double rightdownx;

    private Double rightdowny;

    private Double rightupx;

    private Double rightupy;

    private String desp;

    private Integer calcstime;

    private Integer calcetime;

    private Integer zwtype;

    private Double abc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getExhibitionid() {
        return exhibitionid;
    }

    public void setExhibitionid(Long exhibitionid) {
        this.exhibitionid = exhibitionid;
    }

    public Long getMatchid() {
        return matchid;
    }

    public void setMatchid(Long matchid) {
        this.matchid = matchid;
    }

    public Integer getExhibitorsnum() {
        return exhibitorsnum;
    }

    public void setExhibitorsnum(Integer exhibitorsnum) {
        this.exhibitorsnum = exhibitorsnum;
    }

    public Integer getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(Integer peoplenum) {
        this.peoplenum = peoplenum;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getNetarea() {
        return netarea;
    }

    public void setNetarea(Double netarea) {
        this.netarea = netarea;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Double getLeftdownx() {
        return leftdownx;
    }

    public void setLeftdownx(Double leftdownx) {
        this.leftdownx = leftdownx;
    }

    public Double getLeftdowny() {
        return leftdowny;
    }

    public void setLeftdowny(Double leftdowny) {
        this.leftdowny = leftdowny;
    }

    public Double getLeftupx() {
        return leftupx;
    }

    public void setLeftupx(Double leftupx) {
        this.leftupx = leftupx;
    }

    public Double getLeftupy() {
        return leftupy;
    }

    public void setLeftupy(Double leftupy) {
        this.leftupy = leftupy;
    }

    public Double getRightdownx() {
        return rightdownx;
    }

    public void setRightdownx(Double rightdownx) {
        this.rightdownx = rightdownx;
    }

    public Double getRightdowny() {
        return rightdowny;
    }

    public void setRightdowny(Double rightdowny) {
        this.rightdowny = rightdowny;
    }

    public Double getRightupx() {
        return rightupx;
    }

    public void setRightupx(Double rightupx) {
        this.rightupx = rightupx;
    }

    public Double getRightupy() {
        return rightupy;
    }

    public void setRightupy(Double rightupy) {
        this.rightupy = rightupy;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp == null ? null : desp.trim();
    }

    public Integer getCalcstime() {
        return calcstime;
    }

    public void setCalcstime(Integer calcstime) {
        this.calcstime = calcstime;
    }

    public Integer getCalcetime() {
        return calcetime;
    }

    public void setCalcetime(Integer calcetime) {
        this.calcetime = calcetime;
    }

    public Integer getZwtype() {
        return zwtype;
    }

    public void setZwtype(Integer zwtype) {
        this.zwtype = zwtype;
    }

    public Double getAbc() {
        return abc;
    }

    public void setAbc(Double abc) {
        this.abc = abc;
    }
}