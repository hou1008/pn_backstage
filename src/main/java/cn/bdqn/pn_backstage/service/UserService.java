package cn.bdqn.pn_backstage.service;


import cn.bdqn.pn_backstage.pojo.User;

import java.util.List;

public interface UserService {
    //查找全部User数据
    List<User> getAll();
}
