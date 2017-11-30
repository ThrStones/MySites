package com.thrstones.services;

import com.thrstones.bean.Demo;
import com.thrstones.dao.DemoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yl on 2017/7/10.
 */
@Service
public class DemoService {

    @Autowired
    DemoDao demoDao;

    public List<Demo> findAll() {
        return demoDao.findAll();
    }

    public Demo save(Demo demo) {
        return demoDao.save(demo);
    }

    public Integer update(int demoId, String account, String password, int activeYear) {
       return demoDao.update(demoId, account, password, activeYear);
    }

    public Demo findOne(int demoId) {
        return demoDao.findOne(demoId);
    }

    public void deleteDemoById(int demoId) {
        demoDao.delete(demoId);
    }

    public Demo findDemo(String account, String password) {
        return demoDao.findDemo(account, password);
    }

    public Integer updateStatus(int demoId, boolean activite,String activeTime,String imei) {
        return demoDao.updateStatus(demoId,activite,activeTime,imei);
    }

    public Demo saveAndFlush(Demo demo) {
        return demoDao.saveAndFlush(demo);
    }
}
