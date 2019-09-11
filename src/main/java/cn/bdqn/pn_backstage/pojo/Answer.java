package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;


public class Answer implements Serializable{
    private int aId;
    private int cId;
    private String aContents;


    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }


    public String getaContents() {
        return aContents;
    }

    public void setaContents(String aContents) {
        this.aContents = aContents;
    }
}
