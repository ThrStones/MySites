package com.thrstones.dao;

import com.thrstones.bean.NovelInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/11/22.
 */
public interface NovelDao extends JpaRepository<NovelInfo, Integer> {
}
