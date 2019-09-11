package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Order implements Serializable {
    private int oId;
    private int oBianhao;
    private int oState;
    private int gId;
    private int oNumber;
    private double oMoneys;

    public String getoTime() {
        return oTime;
    }

    public void setoTime(String oTime) {
        this.oTime = oTime;
    }

    private String oTime;
    private int uid;


    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }


    public int getoBianhao() {
        return oBianhao;
    }

    public void setoBianhao(int oBianhao) {
        this.oBianhao = oBianhao;
    }


    public int getoState() {
        return oState;
    }

    public void setoState(int oState) {
        this.oState = oState;
    }


    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }


    public int getoNumber() {
        return oNumber;
    }

    public void setoNumber(int oNumber) {
        this.oNumber = oNumber;
    }


    public double getoMoneys() {
        return oMoneys;
    }

    public void setoMoneys(double oMoneys) {
        this.oMoneys = oMoneys;
    }





    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


}
