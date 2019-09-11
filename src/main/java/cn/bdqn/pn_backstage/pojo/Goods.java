package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Goods implements Serializable {
    private int gId;
    private String gName;
    private int dId;
    private String rContent;
    private int rSeat;

    public String getgTime() {
        return gTime;
    }

    public void setgTime(String gTime) {
        this.gTime = gTime;
    }

    private String gTime;
    private int cId;
    private Double gDiscount;


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }


    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }


    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }


    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent;
    }


    public int getrSeat() {
        return rSeat;
    }

    public void setrSeat(int rSeat) {
        this.rSeat = rSeat;
    }





    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }


    public Double getgDiscount() {
        return gDiscount;
    }

    public void setgDiscount(Double gDiscount) {
        this.gDiscount = gDiscount;
    }


}
