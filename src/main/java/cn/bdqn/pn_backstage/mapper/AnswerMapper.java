package cn.bdqn.pn_backstage.mapper;


import cn.bdqn.demo.pojo.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerMapper extends JpaRepository<Questions,Integer>{

}
