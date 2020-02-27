package com.zthd.sportstravel.api.base.dto;

import java.io.Serializable;

/**
 * Description: <RespDTO><br>
 * Author:      mxdl<br>
 * Date:        2019/6/23<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public class RespDTO<T> implements Serializable{

    public int code ;
    public String error = "";
    public T data;

    @Override
    public String toString() {
        return "RespDTO{" +
                "code=" + code +
                ", error='" + error + '\'' +
                ", data=" + data +
                '}';
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setError(String error) {
        this.error = error;
    }
}
