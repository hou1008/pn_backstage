package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "consults", schema = "pn_pojects", catalog = "")
public class ConsultsEntity {
    private int cId;
    private int uId;
    private String cTitle;
    private String content;
    private int pId;
    private Timestamp cTime;

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
    @Column(name = "cTitle")
    public String getcTitle() {
        return cTitle;
    }

    public void setcTitle(String cTitle) {
        this.cTitle = cTitle;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "pId")
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    @Basic
    @Column(name = "cTime")
    public Timestamp getcTime() {
        return cTime;
    }

    public void setcTime(Timestamp cTime) {
        this.cTime = cTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConsultsEntity that = (ConsultsEntity) o;

        if (cId != that.cId) return false;
        if (uId != that.uId) return false;
        if (pId != that.pId) return false;
        if (cTitle != null ? !cTitle.equals(that.cTitle) : that.cTitle != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (cTime != null ? !cTime.equals(that.cTime) : that.cTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + uId;
        result = 31 * result + (cTitle != null ? cTitle.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + pId;
        result = 31 * result + (cTime != null ? cTime.hashCode() : 0);
        return result;
    }
}
