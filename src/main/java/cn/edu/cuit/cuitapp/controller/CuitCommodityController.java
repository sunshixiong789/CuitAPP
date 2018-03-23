package cn.edu.cuit.cuitapp.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sunshixiong
 * @date 2018/3/22 16:16
 */
@RestController
@RequestMapping(value = "/cuitCommodity")
public class CuitCommodityController {

    @GetMapping
    public List getAll(@PageableDefault(size = 20,sort = "name",direction = Sort.Direction.ASC)Pageable pageable){
        return null;
    }
}
