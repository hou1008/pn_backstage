package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "linkage", schema = "pn_pojects", catalog = "")
public class LinkageEntity {
    private int lId;
    private int gId;
    private int aId;

    @Basic
    @Column(name = "lId")
    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
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
    @Column(name = "aId")
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkageEntity that = (LinkageEntity) o;

        if (lId != that.lId) return false;
        if (gId != that.gId) return false;
        if (aId != that.aId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lId;
        result = 31 * result + gId;
        result = 31 * result + aId;
        return result;
    }
}
