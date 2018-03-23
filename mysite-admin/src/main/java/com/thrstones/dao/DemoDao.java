package com.thrstones.dao;

import com.thrstones.bean.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

/**
 * Created by yl on 2017/7/7.
 */
public interface DemoDao extends JpaRepository<Demo,Integer> {

    @Query(value = "select bean from Demo bean where bean.account=?1 and bean.password=?2")
    Demo findDemo(String account, String password);

    @Modifying
    @Transactional
    @Query(value = "update Demo bean set bean.account=?2 , bean.password=?3 , bean.activeYear=?4 where bean.demoId=?1")
    Integer update(int demoId, String account, String password, int activeYear);

    @Modifying
    @Transactional
    @Query(value = "update Demo bean set bean.activite=?2, bean.activeTime=?3, bean.imei=?4 where bean.demoId=?1")
    Integer updateStatus(int demoId, boolean activite, String activeTime, String imei);
}