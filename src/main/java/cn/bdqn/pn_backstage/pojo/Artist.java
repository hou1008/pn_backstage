package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Artist implements Serializable{
    private int aId;
    private String aName;
    private String aContent;


    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }


    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }


    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }


}
