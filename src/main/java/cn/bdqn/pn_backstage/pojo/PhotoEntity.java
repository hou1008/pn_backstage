package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "photo", schema = "pn_pojects", catalog = "")
public class PhotoEntity {
    private int pId;
    private int gId;
    private String pName;

    @Basic
    @Column(name = "pId")
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
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
    @Column(name = "pName")
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoEntity that = (PhotoEntity) o;

        if (pId != that.pId) return false;
        if (gId != that.gId) return false;
        if (pName != null ? !pName.equals(that.pName) : that.pName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pId;
        result = 31 * result + gId;
        result = 31 * result + (pName != null ? pName.hashCode() : 0);
        return result;
    }
}
