package com.syiaas.pojo;

public class Exhibitioninfo {
    private Long id;

    private String name;

    private String hostunit;

    private String undertakeunit;

    private String pavilion;

    private Double area;

    private Double netarea;

    private Integer peoplenum;

    private String stime;

    private String etime;

    private String address;

    private Integer exhibitorsnum;

    private String contacts;

    private Long telephone;

    private String email;

    private String desp;

    private Integer daytabcfg;

    private Integer daystarttime;

    private Integer dayendtime;

    private Integer type;

    private Integer reservedtype1;

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

    public String getHostunit() {
        return hostunit;
    }

    public void setHostunit(String hostunit) {
        this.hostunit = hostunit == null ? null : hostunit.trim();
    }

    public String getUndertakeunit() {
        return undertakeunit;
    }

    public void setUndertakeunit(String undertakeunit) {
        this.undertakeunit = undertakeunit == null ? null : undertakeunit.trim();
    }

    public String getPavilion() {
        return pavilion;
    }

    public void setPavilion(String pavilion) {
        this.pavilion = pavilion == null ? null : pavilion.trim();
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

    public Integer getPeoplenum() {
        return peoplenum;
    }

    public void setPeoplenum(Integer peoplenum) {
        this.peoplenum = peoplenum;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime == null ? null : stime.trim();
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime == null ? null : etime.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getExhibitorsnum() {
        return exhibitorsnum;
    }

    public void setExhibitorsnum(Integer exhibitorsnum) {
        this.exhibitorsnum = exhibitorsnum;
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

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp == null ? null : desp.trim();
    }

    public Integer getDaytabcfg() {
        return daytabcfg;
    }

    public void setDaytabcfg(Integer daytabcfg) {
        this.daytabcfg = daytabcfg;
    }

    public Integer getDaystarttime() {
        return daystarttime;
    }

    public void setDaystarttime(Integer daystarttime) {
        this.daystarttime = daystarttime;
    }

    public Integer getDayendtime() {
        return dayendtime;
    }

    public void setDayendtime(Integer dayendtime) {
        this.dayendtime = dayendtime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getReservedtype1() {
        return reservedtype1;
    }

    public void setReservedtype1(Integer reservedtype1) {
        this.reservedtype1 = reservedtype1;
    }
}