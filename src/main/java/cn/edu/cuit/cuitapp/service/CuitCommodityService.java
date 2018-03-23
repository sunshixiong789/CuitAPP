package cn.edu.cuit.cuitapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 商品查询
 * @author sunshixiong
 * @date 2018/3/22 16:25
 */
public interface CuitCommodityService {

    /**
     * 获取所有的商品
     * @return
     */
    public Page listCommodity(Pageable pageable);
}
