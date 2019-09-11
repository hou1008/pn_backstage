package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "follow", schema = "pn_pojects", catalog = "")
public class FollowEntity {
    private int fId;
    private int uId;
    private int gId;

    @Basic
    @Column(name = "fId")
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "uId")
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "gId")
    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FollowEntity that = (FollowEntity) o;

        if (fId != that.fId) return false;
        if (uId != that.uId) return false;
        if (gId != that.gId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fId;
        result = 31 * result + uId;
        result = 31 * result + gId;
        return result;
    }
}
