package com.practise.finance.common;

import com.aliyun.oss.*;
import com.practise.finance.common.exception.ResException;
import com.practise.finance.common.result.ResultCodeEnum;
import com.practise.finance.config.OSSConfig;
import com.practise.finance.dto.OssDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
@Slf4j
public class OSSUtils {
    @Autowired
    private OSSConfig ossConfig;

    public static boolean uploadFile(OssDto ossDto) {
        String endpoint = ossDto.getAddress();
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
        String accessKeyId = ossDto.getUserKey();
        String accessKeySecret = ossDto.getPassword();
        OSS ossClient = null;
        try {
            ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
            boolean xiaoliushangcheng = ossClient.doesBucketExist(ossDto.getBucket());
            ossClient.putObject(ossDto.getBucket(), ossDto.getUploadName(), new File(ossDto.getFileName()));
        } catch (Exception e) {
           log.error("上传文件失败，参数为，{}",ossDto);
            throw new ResException(ResultCodeEnum.PARAM_ERROR);
        } finally {
            try {
                ossClient.shutdown();
            } catch (Exception e) {
                log.error("关闭oss连接失败");
                e.printStackTrace();
                throw new ResException(ResultCodeEnum.PARAM_ERROR);
            }

        }
        return true;
    }
}
