package cn.edu.cuit.cuitapp.service.impl;


import cn.edu.cuit.cuitapp.common.CommonCRUD;
import cn.edu.cuit.cuitapp.common.CommonResult;
import cn.edu.cuit.cuitapp.dao.CuitAuctionAttributeDao;
import cn.edu.cuit.cuitapp.model.CuitAuctionAttribute;
import cn.edu.cuit.cuitapp.service.CuitAuctionAttributeService;
import cn.edu.cuit.cuitapp.util.ServiceImplUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sunshixiong on 2018/01/30.
 */
@Slf4j
@Service("cuitAuctionAttributeService")
public class CuitAuctionAttributeServiceImpl implements CuitAuctionAttributeService {

    @Autowired
    CuitAuctionAttributeDao attributeDao;

    @Override
    public CommonResult add(CuitAuctionAttribute entity) {
        return ServiceImplUtil.doCRUD(attributeDao,entity, CommonCRUD.JPAREPOSITORY_SAVE);
    }

    @Override
    public CommonResult delete(CuitAuctionAttribute entity) {
        return ServiceImplUtil.doCRUD(attributeDao,entity,CommonCRUD.JPAREPOSITORY_DELETE);
    }

    @Override
    public CommonResult update(CuitAuctionAttribute entity) {
        return ServiceImplUtil.doCRUD(attributeDao,entity,CommonCRUD.JPAREPOSITORY_UPDATE);
    }

    @Override
    public List<CuitAuctionAttribute> queryList(CuitAuctionAttribute entity) {
        Example example = Example.of(entity);
        return attributeDao.findAll(example);
    }

    @Override
    public Page queryPage(CuitAuctionAttribute entity, Pageable pageable) {
        Example example = Example.of(entity);
        return attributeDao.findAll(example,pageable);
    }
}