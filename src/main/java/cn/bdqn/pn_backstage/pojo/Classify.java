package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Classify implements Serializable {
    private int cId;
    private String cName;
    private int zId;


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }


    public int getzId() {
        return zId;
    }

    public void setzId(int zId) {
        this.zId = zId;
    }

}
