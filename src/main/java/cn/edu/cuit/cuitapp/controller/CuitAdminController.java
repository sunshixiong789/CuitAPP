package cn.edu.cuit.cuitapp.controller;

import cn.edu.cuit.cuitapp.common.CommonJsonView;
import cn.edu.cuit.cuitapp.common.CommonResult;
import cn.edu.cuit.cuitapp.model.CuitAdmin;
import cn.edu.cuit.cuitapp.service.CuitAdminService;
import cn.edu.cuit.cuitapp.validator.BindingResultUtil;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 *用户模块
 * @author sunshixiong on 2018/01/30.
 */
@Slf4j
@RestController
@RequestMapping("cuitAdmin")
public class CuitAdminController {

	@Autowired
	private CuitAdminService cuitAdminService;
	@Autowired
	private PasswordEncoder passwordEncoder;

	/**
	 * 增加一条数据
	 * @param entity
	 * @return
	 */
	@PostMapping
	public CommonResult add(@Valid @RequestBody CuitAdmin entity, BindingResult results) {
 		BindingResultUtil.JudegResult(results);
		entity.setPassWord(passwordEncoder.encode(entity.getPassWord()));
		return cuitAdminService.add(entity);
	}

	/**
	 * 删除一条数据{使用正则表达式来控制id范围}
	 * @param entity
	 * @return
	 */
	@DeleteMapping
	public CommonResult delete(@RequestBody CuitAdmin entity) {
		return cuitAdminService.delete(entity);
	}
	/**
	 * 修改数据
	 * @param entity
	 * @return
	 */
	@PutMapping
	public CommonResult update(@Valid @RequestBody CuitAdmin entity,BindingResult results){
		BindingResultUtil.JudegResult(results);
		entity.setPassWord(passwordEncoder.encode(entity.getPassWord()));
		return cuitAdminService.update(entity);
	}

	/**
	 * 查询数据并且分页｛
	 * 前台这样传参数：?size=2&page=1&sort=id,desc
	 * ｝
	 * @param cuitAdmin
	 * @param pageable
	 * @return
	 */
	@GetMapping
	public Page<CuitAdmin> query(CuitAdmin cuitAdmin
			, @PageableDefault(size = 20,sort = "name"
			,direction = Sort.Direction.ASC)Pageable pageable) {
		System.out.println("sunshfi");
		return cuitAdminService.queryPage(cuitAdmin,pageable);
	}

	/**
	 * 查询数据的列表
	 * @param cuitAdmin
	 * @return
	 */
	@GetMapping(value = "/list")
	@JsonView(CommonJsonView.SimpleView.class)
	public List<CuitAdmin> queryById(CuitAdmin cuitAdmin) {
		return cuitAdminService.queryList(cuitAdmin);
	}
}