package com.entity;

import java.util.Date;

public class Collect {
    private Integer collectId;

    private Integer collectUid;

    private Integer collectMvid;

    private Date collectCreatetime;



    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getCollectUid() {
        return collectUid;
    }

    public void setCollectUid(Integer collectUid) {
        this.collectUid = collectUid;
    }

    public Integer getCollectMvid() {
        return collectMvid;
    }

    public void setCollectMvid(Integer collectMvid) {
        this.collectMvid = collectMvid;
    }

    public Date getCollectCreatetime() {
        return collectCreatetime;
    }

    public void setCollectCreatetime(Date collectCreatetime) {
        this.collectCreatetime = collectCreatetime;
    }
}