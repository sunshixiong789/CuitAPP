package cn.edu.cuit.cuitapp.dao;

import cn.edu.cuit.cuitapp.model.CuitAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ApplicationPower.
 * @author sunshixiong on 2018/01/30.
 */
public interface CuitAdminDao extends JpaRepository<CuitAdmin,Integer> {

}