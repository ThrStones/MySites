package com.thrstones.common;

import java.io.Serializable;
import java.util.List;

/**
 * 分页通用Bean
 *
 * @Author ThrStones
 * @Created by ThrStones on 2017-12-04 13:15.
 */
public class PageBean<T>  implements Serializable {
    /**
     * 总记录数
     */
    private int total;

    /**
     * 数据
     */
    private T rows;

    public PageBean(int total, T rows) {
        this.total = total;
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public T getRows() {
        return rows;
    }

    public void setRows(T rows) {
        this.rows = rows;
    }
}