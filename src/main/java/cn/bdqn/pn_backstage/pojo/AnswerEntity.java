package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "answer", schema = "pn_pojects", catalog = "")
public class AnswerEntity {
    private int aId;
    private int cId;
    private String aContents;

    @Basic
    @Column(name = "aId")
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Basic
    @Column(name = "cId")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "aContents")
    public String getaContents() {
        return aContents;
    }

    public void setaContents(String aContents) {
        this.aContents = aContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnswerEntity that = (AnswerEntity) o;

        if (aId != that.aId) return false;
        if (cId != that.cId) return false;
        if (aContents != null ? !aContents.equals(that.aContents) : that.aContents != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId;
        result = 31 * result + cId;
        result = 31 * result + (aContents != null ? aContents.hashCode() : 0);
        return result;
    }
}
