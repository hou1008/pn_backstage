package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Comment implements Serializable {
    private int cId;
    private int uId;
    private int gId;
    private String contents;


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }


    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }


}
