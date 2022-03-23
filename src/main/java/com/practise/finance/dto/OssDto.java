package com.practise.finance.dto;

import lombok.Data;

/**
 *  表示上传至oss工具类的相关参数信息
 */
@Data
public class OssDto {
    /*
    上传的OSS地址
     */
    private String address;
    /*
       上传的OSS的用户签名
    */
    private String userKey;
    /*
       上传的OSS的用户密码
    */
    private String password;
    /*
       上传的OSS的bucket名称
    */
    private String bucket;
    /*
       上传的OSS的上传后的文件显示名称
    */
    private String fileName;
    /*
   上传的OSS的b上传文件的全路径
    */
    private String uploadName;
}
