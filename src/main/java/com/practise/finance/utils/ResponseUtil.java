/**
 * Copyright (C), 2020-2020
 * FileName: ResponseUtil
 * Author:   zcl
 * Date:     2020/5/14 17:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.practise.finance.utils;


public class ResponseUtil {




    public static <T> Response<T> makeFail(String message) {
        return makeResponse(500, message, null);
    }

    public static <T> Response<T> makeFail(Integer code, String message) {
        return makeResponse(code, message, null);
    }




    public static <T> Response<T> makeSuccess(T obj) {
        return makeResponse(0, "", obj);
    }

    public static <T> Response<T> makeSuccess(T obj, String msg) {
        return makeResponse(200, msg, obj);
    }

    public static <T> Response<T> makeFail(T obj) {
        return makeResponse(500, "", obj);
    }






    public static <T> Response<T> makeResponse(int code, String msg, T obj) {
        Response<T> result = new Response<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(obj);

        return result;
    }

    public static boolean isOk(Response response) {
        if (response != null && response.getCode() == 0) {
            return true;
        }
        return false;
    }


}
