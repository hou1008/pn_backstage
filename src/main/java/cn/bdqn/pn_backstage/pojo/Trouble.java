package cn.bdqn.pn_backstage.pojo;


import java.io.Serializable;

public class Trouble implements Serializable {
    private int tId;
    private String tProblem;
    private String tAnswer;


    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }


    public String gettProblem() {
        return tProblem;
    }

    public void settProblem(String tProblem) {
        this.tProblem = tProblem;
    }

    public String gettAnswer() {
        return tAnswer;
    }

    public void settAnswer(String tAnswer) {
        this.tAnswer = tAnswer;
    }


}
