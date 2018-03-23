package cn.edu.cuit.cuitapp.dao;

import cn.edu.cuit.cuitapp.model.CuitPicture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by ApplicationPower.
 * @author sunshixiong on 2018/01/30.
 */
public interface CuitPictureDao extends JpaRepository<CuitPicture,Integer> {

    /**
     * 通过商品id查询图片列表
     * @param commodityId
     * @return
     */
    public List<CuitPicture> findAllByCuitCommodityId(String commodityId);
}