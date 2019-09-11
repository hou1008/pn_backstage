package cn.bdqn.pn_backstage.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "trouble", schema = "pn_pojects", catalog = "")
public class TroubleEntity {
    private int tId;
    private String tProblem;
    private String tAnswer;

    @Basic
    @Column(name = "tId")
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Basic
    @Column(name = "tProblem")
    public String gettProblem() {
        return tProblem;
    }

    public void settProblem(String tProblem) {
        this.tProblem = tProblem;
    }

    @Basic
    @Column(name = "tAnswer")
    public String gettAnswer() {
        return tAnswer;
    }

    public void settAnswer(String tAnswer) {
        this.tAnswer = tAnswer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TroubleEntity that = (TroubleEntity) o;

        if (tId != that.tId) return false;
        if (tProblem != null ? !tProblem.equals(that.tProblem) : that.tProblem != null) return false;
        if (tAnswer != null ? !tAnswer.equals(that.tAnswer) : that.tAnswer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tId;
        result = 31 * result + (tProblem != null ? tProblem.hashCode() : 0);
        result = 31 * result + (tAnswer != null ? tAnswer.hashCode() : 0);
        return result;
    }
}
