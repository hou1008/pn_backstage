package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Photo implements Serializable {
    private int pId;
    private int gId;
    private String pName;


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }


}
