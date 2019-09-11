package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "district", schema = "pn_pojects", catalog = "")
public class DistrictEntity {
    private int dId;
    private String dName;
    private int parentId;

    @Basic
    @Column(name = "dId")
    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    @Basic
    @Column(name = "dName")
    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Basic
    @Column(name = "parentId")
    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DistrictEntity that = (DistrictEntity) o;

        if (dId != that.dId) return false;
        if (parentId != that.parentId) return false;
        if (dName != null ? !dName.equals(that.dName) : that.dName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dId;
        result = 31 * result + (dName != null ? dName.hashCode() : 0);
        result = 31 * result + parentId;
        return result;
    }
}
