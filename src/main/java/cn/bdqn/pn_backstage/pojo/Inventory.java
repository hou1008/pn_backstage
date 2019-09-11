package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Inventory implements Serializable{
    private int iId;
    private int tId;
    private int iVotes;
    private int iSurplus;
    private int iSold;


    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }


    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }


    public int getiVotes() {
        return iVotes;
    }

    public void setiVotes(int iVotes) {
        this.iVotes = iVotes;
    }


    public int getiSurplus() {
        return iSurplus;
    }

    public void setiSurplus(int iSurplus) {
        this.iSurplus = iSurplus;
    }


    public int getiSold() {
        return iSold;
    }

    public void setiSold(int iSold) {
        this.iSold = iSold;
    }


}
