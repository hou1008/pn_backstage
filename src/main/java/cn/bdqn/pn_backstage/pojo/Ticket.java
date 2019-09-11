package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Ticket implements Serializable {
    private int tId;
    private int sId;
    private double tMoney;


    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }


    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }


    public double gettMoney() {
        return tMoney;
    }

    public void settMoney(double tMoney) {
        this.tMoney = tMoney;
    }


}
