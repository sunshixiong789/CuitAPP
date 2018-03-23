package cn.edu.cuit.cuitapp.service;

import cn.edu.cuit.cuitapp.common.CommonResult;
import cn.edu.cuit.cuitapp.model.CuitPicture;
import java.util.List;

/**
 * @author sunshixiong
 * @date 2018/3/20 15:51
 */
public interface CuitPictureService {

    /**
     * 增加数据
     * @param entity
     * @return
     */
    CommonResult add(CuitPicture entity);
    /**
     * 删除数据
     * @param entity
     * @return
     */
    CommonResult delete(CuitPicture entity);
    /**
     * 修改数据
     * @param entity
     * @return
     */
    CommonResult update(CuitPicture entity);

    /**
     * 通过商品id查询
     * @param commodityId
     * @return
     */
    List<CuitPicture> queryByCommodityId(String commodityId);
}
