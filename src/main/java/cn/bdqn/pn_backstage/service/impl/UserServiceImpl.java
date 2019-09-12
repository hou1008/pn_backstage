package cn.bdqn.pn_backstage.service.impl;

import cn.bdqn.pn_backstage.dao.UserDao;
import cn.bdqn.pn_backstage.pojo.User;
import cn.bdqn.pn_backstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao dao;
    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}
