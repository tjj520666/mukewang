package com.entity;

public class Stutype {
    private Integer stutypeId;

    private String stutypeStuname;

    public Integer getStutypeId() {
        return stutypeId;
    }

    public void setStutypeId(Integer stutypeId) {
        this.stutypeId = stutypeId;
    }

    public String getStutypeStuname() {
        return stutypeStuname;
    }

    public void setStutypeStuname(String stutypeStuname) {
        this.stutypeStuname = stutypeStuname == null ? null : stutypeStuname.trim();
    }
}