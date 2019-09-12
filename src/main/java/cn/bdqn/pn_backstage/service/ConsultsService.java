package cn.bdqn.pn_backstage.service;

import cn.bdqn.pn_backstage.pojo.Consults;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ConsultsService {

    List<Consults> getAll();
}
