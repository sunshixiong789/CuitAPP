package cn.edu.cuit.cuitapp.controller;

import cn.edu.cuit.cuitapp.common.CommonResult;
import cn.edu.cuit.cuitapp.dao.CuitPictureDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品拍卖历史
 * @author sunshixiong
 * @date 2018/3/27 21:44
 */
@RestController
@RequestMapping(value = "cuitBidHistory")
public class CuitBidHistoryController {

    @Autowired
    private CuitPictureDao cuitPictureDao;

    @PostMapping
    public CommonResult add(){
        return null;
    }
}
