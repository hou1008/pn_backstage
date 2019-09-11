package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "comment", schema = "pn_pojects", catalog = "")
public class CommentEntity {
    private int cId;
    private int uId;
    private int gId;
    private String contents;

    @Basic
    @Column(name = "cId")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
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

    @Basic
    @Column(name = "Contents")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (cId != that.cId) return false;
        if (uId != that.uId) return false;
        if (gId != that.gId) return false;
        if (contents != null ? !contents.equals(that.contents) : that.contents != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + uId;
        result = 31 * result + gId;
        result = 31 * result + (contents != null ? contents.hashCode() : 0);
        return result;
    }
}
