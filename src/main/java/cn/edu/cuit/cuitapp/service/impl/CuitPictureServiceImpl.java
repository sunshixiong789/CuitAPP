package cn.edu.cuit.cuitapp.service.impl;

import cn.edu.cuit.cuitapp.common.CommonCRUD;
import cn.edu.cuit.cuitapp.common.CommonResult;
import cn.edu.cuit.cuitapp.dao.CuitPictureDao;
import cn.edu.cuit.cuitapp.model.CuitPicture;
import cn.edu.cuit.cuitapp.service.CuitPictureService;
import cn.edu.cuit.cuitapp.util.ServiceImplUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author sunshixiong
 * @date 2018/3/20 15:56
 */
@Slf4j
@Component
public class CuitPictureServiceImpl implements CuitPictureService {

    @Autowired
    CuitPictureDao cuitPictureDao;

    @Override
    public CommonResult add(CuitPicture entity) {
        return ServiceImplUtil.doCRUD(cuitPictureDao,entity, CommonCRUD.JPAREPOSITORY_SAVE);
    }

    @Override
    public CommonResult delete(CuitPicture entity) {
        return ServiceImplUtil.doCRUD(cuitPictureDao,entity,CommonCRUD.JPAREPOSITORY_DELETE);
    }

    @Override
    public CommonResult update(CuitPicture entity) {
        return ServiceImplUtil.doCRUD(cuitPictureDao,entity,CommonCRUD.JPAREPOSITORY_UPDATE);
    }

    @Override
    public List<CuitPicture> queryByCommodityId(String commodityId) {
        return cuitPictureDao.findAllByCuitCommodityId(commodityId);
    }
}
