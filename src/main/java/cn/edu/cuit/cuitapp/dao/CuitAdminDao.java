package cn.edu.cuit.cuitapp.dao;

import cn.edu.cuit.cuitapp.model.CuitAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by ApplicationPower.
 * @author sunshixiong on 2018/01/30.
 */
public interface CuitAdminDao extends JpaRepository<CuitAdmin,Integer> {

    /**
     * 通过登录名查询用户信息
     * @param name
     * @return
     */
    public CuitAdmin findByName(String name);

    @Query(value = "select u from CuitAdmin u where u.id = ?1",nativeQuery = false)
    public CuitAdmin queryOne(Integer id);
}