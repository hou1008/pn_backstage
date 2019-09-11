package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "scene", schema = "pn_pojects", catalog = "")
public class SceneEntity {
    private int sId;
    private int gId;
    private String sName;

    @Basic
    @Column(name = "sId")
    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
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
    @Column(name = "sName")
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SceneEntity that = (SceneEntity) o;

        if (sId != that.sId) return false;
        if (gId != that.gId) return false;
        if (sName != null ? !sName.equals(that.sName) : that.sName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sId;
        result = 31 * result + gId;
        result = 31 * result + (sName != null ? sName.hashCode() : 0);
        return result;
    }
}
