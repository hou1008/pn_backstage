package cn.bdqn.pn_backstage.pojo;

import javax.persistence.*;

@Entity
@Table(name = "balance", schema = "pn_pojects", catalog = "")
public class BalanceEntity {
    private int bId;
    private int uid;
    private double bTotal;

    @Id
    @Column(name = "bId")
    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    @Basic
    @Column(name = "uid")
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "bTotal")
    public double getbTotal() {
        return bTotal;
    }

    public void setbTotal(double bTotal) {
        this.bTotal = bTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BalanceEntity that = (BalanceEntity) o;

        if (bId != that.bId) return false;
        if (uid != that.uid) return false;
        if (Double.compare(that.bTotal, bTotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bId;
        result = 31 * result + uid;
        temp = Double.doubleToLongBits(bTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
