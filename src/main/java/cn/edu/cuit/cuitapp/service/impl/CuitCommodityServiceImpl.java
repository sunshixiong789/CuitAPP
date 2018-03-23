package cn.edu.cuit.cuitapp.service.impl;

import cn.edu.cuit.cuitapp.dao.CuitCommodityDao;
import cn.edu.cuit.cuitapp.model.CuitCommodity;
import cn.edu.cuit.cuitapp.service.CuitCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sunshixiong
 * @date 2018/3/22 16:25
 */
@Service(value = "cuitCommodityService")
public class CuitCommodityServiceImpl implements CuitCommodityService {

    @Autowired
    CuitCommodityDao cuitCommodityDao;

    @Override
    public Page listCommodity(Pageable pageable) {

        Page<CuitCommodity> page = cuitCommodityDao.findAll(pageable);
        List<CuitCommodity> cuitCommodity = page.getContent();
        
        return null;
    }
}
