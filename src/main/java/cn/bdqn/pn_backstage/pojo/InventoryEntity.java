package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inventory", schema = "pn_pojects", catalog = "")
public class InventoryEntity {
    private int iId;
    private int tId;
    private int iVotes;
    private int iSurplus;
    private int iSold;

    @Basic
    @Column(name = "iId")
    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    @Basic
    @Column(name = "tId")
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "iVotes")
    public int getiVotes() {
        return iVotes;
    }

    public void setiVotes(int iVotes) {
        this.iVotes = iVotes;
    }

    @Basic
    @Column(name = "iSurplus")
    public int getiSurplus() {
        return iSurplus;
    }

    public void setiSurplus(int iSurplus) {
        this.iSurplus = iSurplus;
    }

    @Basic
    @Column(name = "iSold")
    public int getiSold() {
        return iSold;
    }

    public void setiSold(int iSold) {
        this.iSold = iSold;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InventoryEntity that = (InventoryEntity) o;

        if (iId != that.iId) return false;
        if (tId != that.tId) return false;
        if (iVotes != that.iVotes) return false;
        if (iSurplus != that.iSurplus) return false;
        if (iSold != that.iSold) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iId;
        result = 31 * result + tId;
        result = 31 * result + iVotes;
        result = 31 * result + iSurplus;
        result = 31 * result + iSold;
        return result;
    }
}
