package com.thrstones.common;

import java.io.Serializable;

/**
 * Created by yl on 2017/7/7.
 *
 * @param <T> 通用结果对象
 */
public class ResultBean<T> implements Serializable {

    //操作是否成功
    private int status;

    //提示信息
    private String message;

    //返回结果
    private T data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 构造函数，默认生成操作执行成功信息，无返回值
     */
    public ResultBean() {
        this.status = 0;
        this.message = "Successful";
        this.data = null;
    }
}
