package com.syiaas.pojo;

public class Historylocation {
    private Long id;

    private Long datatime;

    private Long buildid;

    private Long exhibitorsid;

    private String mac;

    private Double axisx;

    private Double axisy;

    private Double axisz;

    private Long exhibitionid;

    private Long displayareaid;

    private Integer flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDatatime() {
        return datatime;
    }

    public void setDatatime(Long datatime) {
        this.datatime = datatime;
    }

    public Long getBuildid() {
        return buildid;
    }

    public void setBuildid(Long buildid) {
        this.buildid = buildid;
    }

    public Long getExhibitorsid() {
        return exhibitorsid;
    }

    public void setExhibitorsid(Long exhibitorsid) {
        this.exhibitorsid = exhibitorsid;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac == null ? null : mac.trim();
    }

    public Double getAxisx() {
        return axisx;
    }

    public void setAxisx(Double axisx) {
        this.axisx = axisx;
    }

    public Double getAxisy() {
        return axisy;
    }

    public void setAxisy(Double axisy) {
        this.axisy = axisy;
    }

    public Double getAxisz() {
        return axisz;
    }

    public void setAxisz(Double axisz) {
        this.axisz = axisz;
    }

    public Long getExhibitionid() {
        return exhibitionid;
    }

    public void setExhibitionid(Long exhibitionid) {
        this.exhibitionid = exhibitionid;
    }

    public Long getDisplayareaid() {
        return displayareaid;
    }

    public void setDisplayareaid(Long displayareaid) {
        this.displayareaid = displayareaid;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}