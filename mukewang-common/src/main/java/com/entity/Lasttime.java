package com.entity;

import java.util.Date;

public class Lasttime {
    private Integer lasttimeId;

    private Date lasttimeLogintime;

    private String lasttimeLoginaddress;

    private String lasttimeIp;

    private String lasttimeLoginequipment;

    public Integer getLasttimeId() {
        return lasttimeId;
    }

    public void setLasttimeId(Integer lasttimeId) {
        this.lasttimeId = lasttimeId;
    }

    public Date getLasttimeLogintime() {
        return lasttimeLogintime;
    }

    public void setLasttimeLogintime(Date lasttimeLogintime) {
        this.lasttimeLogintime = lasttimeLogintime;
    }

    public String getLasttimeLoginaddress() {
        return lasttimeLoginaddress;
    }

    public void setLasttimeLoginaddress(String lasttimeLoginaddress) {
        this.lasttimeLoginaddress = lasttimeLoginaddress == null ? null : lasttimeLoginaddress.trim();
    }

    public String getLasttimeIp() {
        return lasttimeIp;
    }

    public void setLasttimeIp(String lasttimeIp) {
        this.lasttimeIp = lasttimeIp == null ? null : lasttimeIp.trim();
    }

    public String getLasttimeLoginequipment() {
        return lasttimeLoginequipment;
    }

    public void setLasttimeLoginequipment(String lasttimeLoginequipment) {
        this.lasttimeLoginequipment = lasttimeLoginequipment == null ? null : lasttimeLoginequipment.trim();
    }
}