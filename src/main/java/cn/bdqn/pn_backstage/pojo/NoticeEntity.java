package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notice", schema = "pn_pojects", catalog = "")
public class NoticeEntity {
    private int nId;
    private int gId;
    private String nExplain;
    private String nSeat;
    private String nTips;
    private String nProhibit;
    private String nEntity;
    private String nElectronic;
    private String nLimit;

    @Basic
    @Column(name = "nId")
    public int getnId() {
        return nId;
    }

    public void setnId(int nId) {
        this.nId = nId;
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
    @Column(name = "nExplain")
    public String getnExplain() {
        return nExplain;
    }

    public void setnExplain(String nExplain) {
        this.nExplain = nExplain;
    }

    @Basic
    @Column(name = "nSeat")
    public String getnSeat() {
        return nSeat;
    }

    public void setnSeat(String nSeat) {
        this.nSeat = nSeat;
    }

    @Basic
    @Column(name = "nTips")
    public String getnTips() {
        return nTips;
    }

    public void setnTips(String nTips) {
        this.nTips = nTips;
    }

    @Basic
    @Column(name = "nProhibit")
    public String getnProhibit() {
        return nProhibit;
    }

    public void setnProhibit(String nProhibit) {
        this.nProhibit = nProhibit;
    }

    @Basic
    @Column(name = "nEntity")
    public String getnEntity() {
        return nEntity;
    }

    public void setnEntity(String nEntity) {
        this.nEntity = nEntity;
    }

    @Basic
    @Column(name = "nElectronic")
    public String getnElectronic() {
        return nElectronic;
    }

    public void setnElectronic(String nElectronic) {
        this.nElectronic = nElectronic;
    }

    @Basic
    @Column(name = "nLimit")
    public String getnLimit() {
        return nLimit;
    }

    public void setnLimit(String nLimit) {
        this.nLimit = nLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeEntity that = (NoticeEntity) o;

        if (nId != that.nId) return false;
        if (gId != that.gId) return false;
        if (nExplain != null ? !nExplain.equals(that.nExplain) : that.nExplain != null) return false;
        if (nSeat != null ? !nSeat.equals(that.nSeat) : that.nSeat != null) return false;
        if (nTips != null ? !nTips.equals(that.nTips) : that.nTips != null) return false;
        if (nProhibit != null ? !nProhibit.equals(that.nProhibit) : that.nProhibit != null) return false;
        if (nEntity != null ? !nEntity.equals(that.nEntity) : that.nEntity != null) return false;
        if (nElectronic != null ? !nElectronic.equals(that.nElectronic) : that.nElectronic != null) return false;
        if (nLimit != null ? !nLimit.equals(that.nLimit) : that.nLimit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nId;
        result = 31 * result + gId;
        result = 31 * result + (nExplain != null ? nExplain.hashCode() : 0);
        result = 31 * result + (nSeat != null ? nSeat.hashCode() : 0);
        result = 31 * result + (nTips != null ? nTips.hashCode() : 0);
        result = 31 * result + (nProhibit != null ? nProhibit.hashCode() : 0);
        result = 31 * result + (nEntity != null ? nEntity.hashCode() : 0);
        result = 31 * result + (nElectronic != null ? nElectronic.hashCode() : 0);
        result = 31 * result + (nLimit != null ? nLimit.hashCode() : 0);
        return result;
    }
}
