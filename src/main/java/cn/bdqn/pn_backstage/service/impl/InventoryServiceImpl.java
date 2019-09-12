package cn.bdqn.pn_backstage.service.impl;

import cn.bdqn.pn_backstage.dao.InventoryDao;
import cn.bdqn.pn_backstage.pojo.Inventory;
import cn.bdqn.pn_backstage.service.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {
    private InventoryDao InventoryDao;
    @Override
    public List<Inventory> zha() {
        return InventoryDao.zha();
    }
}
