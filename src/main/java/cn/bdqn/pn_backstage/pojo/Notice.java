package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Notice implements Serializable {
    private int nId;
    private int gId;
    private String nExplain;
    private String nSeat;
    private String nTips;
    private String nProhibit;
    private String nEntity;
    private String nElectronic;
    private String nLimit;

    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }


    public String getnExplain() {
        return nExplain;
    }

    public void setnExplain(String nExplain) {
        this.nExplain = nExplain;
    }


    public String getnSeat() {
        return nSeat;
    }

    public void setnSeat(String nSeat) {
        this.nSeat = nSeat;
    }


    public String getnTips() {
        return nTips;
    }

    public void setnTips(String nTips) {
        this.nTips = nTips;
    }


    public String getnProhibit() {
        return nProhibit;
    }

    public void setnProhibit(String nProhibit) {
        this.nProhibit = nProhibit;
    }


    public String getnEntity() {
        return nEntity;
    }

    public void setnEntity(String nEntity) {
        this.nEntity = nEntity;
    }


    public String getnElectronic() {
        return nElectronic;
    }

    public void setnElectronic(String nElectronic) {
        this.nElectronic = nElectronic;
    }


    public String getnLimit() {
        return nLimit;
    }

    public void setnLimit(String nLimit) {
        this.nLimit = nLimit;
    }


}
