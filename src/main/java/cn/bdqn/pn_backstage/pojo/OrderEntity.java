package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "order", schema = "pn_pojects", catalog = "")
public class OrderEntity {
    private int oId;
    private int oBianhao;
    private int oState;
    private int gId;
    private int oNumber;
    private double oMoneys;
    private Timestamp oTime;
    private int uid;

    @Basic
    @Column(name = "oId")
    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    @Basic
    @Column(name = "oBianhao")
    public int getoBianhao() {
        return oBianhao;
    }

    public void setoBianhao(int oBianhao) {
        this.oBianhao = oBianhao;
    }

    @Basic
    @Column(name = "oState")
    public int getoState() {
        return oState;
    }

    public void setoState(int oState) {
        this.oState = oState;
    }

    @Basic
    @Column(name = "gId")
    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    @Basic
    @Column(name = "oNumber")
    public int getoNumber() {
        return oNumber;
    }

    public void setoNumber(int oNumber) {
        this.oNumber = oNumber;
    }

    @Basic
    @Column(name = "oMoneys")
    public double getoMoneys() {
        return oMoneys;
    }

    public void setoMoneys(double oMoneys) {
        this.oMoneys = oMoneys;
    }

    @Basic
    @Column(name = "oTime")
    public Timestamp getoTime() {
        return oTime;
    }

    public void setoTime(Timestamp oTime) {
        this.oTime = oTime;
    }

    @Basic
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (oId != that.oId) return false;
        if (oBianhao != that.oBianhao) return false;
        if (oState != that.oState) return false;
        if (gId != that.gId) return false;
        if (oNumber != that.oNumber) return false;
        if (Double.compare(that.oMoneys, oMoneys) != 0) return false;
        if (uid != that.uid) return false;
        if (oTime != null ? !oTime.equals(that.oTime) : that.oTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = oId;
        result = 31 * result + oBianhao;
        result = 31 * result + oState;
        result = 31 * result + gId;
        result = 31 * result + oNumber;
        temp = Double.doubleToLongBits(oMoneys);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (oTime != null ? oTime.hashCode() : 0);
        result = 31 * result + uid;
        return result;
    }
}
