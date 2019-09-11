package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class District implements Serializable {
    private int dId;
    private String dName;
    private int parentId;


    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }


    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }


    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


}
