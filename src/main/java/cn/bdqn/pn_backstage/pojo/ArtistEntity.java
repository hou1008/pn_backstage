package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "artist", schema = "pn_pojects", catalog = "")
public class ArtistEntity {
    private int aId;
    private String aName;
    private String aContent;

    @Basic
    @Column(name = "aId")
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Basic
    @Column(name = "aName")
    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    @Basic
    @Column(name = "aContent")
    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtistEntity that = (ArtistEntity) o;

        if (aId != that.aId) return false;
        if (aName != null ? !aName.equals(that.aName) : that.aName != null) return false;
        if (aContent != null ? !aContent.equals(that.aContent) : that.aContent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId;
        result = 31 * result + (aName != null ? aName.hashCode() : 0);
        result = 31 * result + (aContent != null ? aContent.hashCode() : 0);
        return result;
    }
}
