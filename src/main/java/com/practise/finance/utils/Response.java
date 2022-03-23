/**
 * Copyright (C), 2020-2020
 * FileName: Response
 * Author:   zcl
 * Date:     2020/5/14 16:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.practise.finance.utils;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1998307887673028548L;

    public static final Response OK = new Response(0,"success");

    private int code;
    private String msg;
    private T data;

    public Response() {
    }

    public Response(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Response)) {
            return false;
        }
        return this.getCode() == ((Response) obj).getCode();
    }

    public int hashCode() {
        return this.code;
    }

    public boolean ok() {
        return this.code == 0;
    }

    public boolean notOk() {
        return this.code != 0;
    }
}

