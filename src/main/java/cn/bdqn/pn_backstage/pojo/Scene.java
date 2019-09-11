package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Scene implements Serializable {
    private int sId;
    private int gId;
    private String sName;

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }


}
