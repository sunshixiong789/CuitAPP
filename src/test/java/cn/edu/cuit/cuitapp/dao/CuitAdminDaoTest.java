package cn.edu.cuit.cuitapp.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CuitAdminDaoTest {
    @Autowired
    private CuitAdminDao cuitAdminDao;

    @Test
    public void findByName(){
        System.out.println(cuitAdminDao.queryOne(1));
    }
}