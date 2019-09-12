package cn.bdqn.pn_backstage.service.impl;

import cn.bdqn.pn_backstage.dao.ConsultsDao;
import cn.bdqn.pn_backstage.pojo.Consults;
import cn.bdqn.pn_backstage.service.ConsultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ConsultsService")
public class ConsultsServiceImpl implements ConsultsService {

    @Autowired
    private ConsultsDao consultsDao;

    @Override
    public List<Consults> getAll() {
        return consultsDao.getAll();
    }
}
