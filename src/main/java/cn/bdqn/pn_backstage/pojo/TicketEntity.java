package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ticket", schema = "pn_pojects", catalog = "")
public class TicketEntity {
    private int tId;
    private int sId;
    private double tMoney;

    @Basic
    @Column(name = "tId")
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "sId")
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Basic
    @Column(name = "tMoney")
    public double gettMoney() {
        return tMoney;
    }

    public void settMoney(double tMoney) {
        this.tMoney = tMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketEntity that = (TicketEntity) o;

        if (tId != that.tId) return false;
        if (sId != that.sId) return false;
        if (Double.compare(that.tMoney, tMoney) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = tId;
        result = 31 * result + sId;
        temp = Double.doubleToLongBits(tMoney);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
