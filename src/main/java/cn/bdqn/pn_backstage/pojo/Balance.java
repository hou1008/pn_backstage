package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Balance implements Serializable {
    private int bId;
    private int uid;
    private double bTotal;


    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    public double getbTotal() {
        return bTotal;
    }

    public void setbTotal(double bTotal) {
        this.bTotal = bTotal;
    }

}
