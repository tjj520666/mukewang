package com.entity;

public class Purchase {

    private Integer id;

    private int mvId;

    private Integer uId;

    private Mv mv;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMvId() {
        return mvId;
    }

    public void setMvId(int mvId) {
        this.mvId = mvId;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Mv getMv() {
        return mv;
    }

    public void setMv(Mv mv) {
        this.mv = mv;
    }


    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", mvId=" + mvId +
                ", uId=" + uId +
                ", mv=" + mv +
                '}';
    }
}
