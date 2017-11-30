package com.thrstones.services;

import com.thrstones.bean.Demo;
import com.thrstones.bean.NovelInfo;
import com.thrstones.dao.NovelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/22.
 */
@Service
public class NovelService {

    @Autowired
    NovelDao novelDao;

    public List<NovelInfo> findAll() {
        return novelDao.findAll();
    }

    public NovelInfo findOne(int novelId) {
        return novelDao.findOne(novelId);
    }
}
