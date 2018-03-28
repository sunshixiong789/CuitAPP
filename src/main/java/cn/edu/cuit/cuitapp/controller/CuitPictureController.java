package cn.edu.cuit.cuitapp.controller;

import cn.edu.cuit.cuitapp.model.CuitPicture;
import cn.edu.cuit.cuitapp.service.CuitPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 获取商品图片
 * @author sunshixiong
 * @date 2018/3/26 14:26
 */
@RestController
@RequestMapping("cuitPicture")
public class CuitPictureController {

    @Autowired
    CuitPictureService cuitPictureService;

    /**
     *获取对应商品id的三张图片
     * @return
     */
    @GetMapping(value = "/{id}")
    public List<CuitPicture> getPictures(@PathVariable String id, @PageableDefault(size = 4,sort = "insertTime"
            ,direction = Sort.Direction.ASC)Pageable pageable){
        return cuitPictureService.queryByCommodityId(id,pageable);
    }
 }
