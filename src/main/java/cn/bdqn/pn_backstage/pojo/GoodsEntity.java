package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "goods", schema = "pn_pojects", catalog = "")
public class GoodsEntity {
    private int gId;
    private String gName;
    private int dId;
    private String rContent;
    private int rSeat;
    private Timestamp gTime;
    private int cId;
    private Double gDiscount;

    @Basic
    @Column(name = "gId")
    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    @Basic
    @Column(name = "gName")
    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    @Basic
    @Column(name = "dId")
    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    @Basic
    @Column(name = "rContent")
    public String getrContent() {
        return rContent;
    }

    public void setrContent(String rContent) {
        this.rContent = rContent;
    }

    @Basic
    @Column(name = "rSeat")
    public int getrSeat() {
        return rSeat;
    }

    public void setrSeat(int rSeat) {
        this.rSeat = rSeat;
    }

    @Basic
    @Column(name = "gTime")
    public Timestamp getgTime() {
        return gTime;
    }

    public void setgTime(Timestamp gTime) {
        this.gTime = gTime;
    }

    @Basic
    @Column(name = "cId")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "gDiscount")
    public Double getgDiscount() {
        return gDiscount;
    }

    public void setgDiscount(Double gDiscount) {
        this.gDiscount = gDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GoodsEntity that = (GoodsEntity) o;

        if (gId != that.gId) return false;
        if (dId != that.dId) return false;
        if (rSeat != that.rSeat) return false;
        if (cId != that.cId) return false;
        if (gName != null ? !gName.equals(that.gName) : that.gName != null) return false;
        if (rContent != null ? !rContent.equals(that.rContent) : that.rContent != null) return false;
        if (gTime != null ? !gTime.equals(that.gTime) : that.gTime != null) return false;
        if (gDiscount != null ? !gDiscount.equals(that.gDiscount) : that.gDiscount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gId;
        result = 31 * result + (gName != null ? gName.hashCode() : 0);
        result = 31 * result + dId;
        result = 31 * result + (rContent != null ? rContent.hashCode() : 0);
        result = 31 * result + rSeat;
        result = 31 * result + (gTime != null ? gTime.hashCode() : 0);
        result = 31 * result + cId;
        result = 31 * result + (gDiscount != null ? gDiscount.hashCode() : 0);
        return result;
    }
}
