package com.practise.finance.controller;

import com.alibaba.fastjson.JSONObject;
import com.practise.finance.common.OSSUtils;
import com.practise.finance.common.result.Result;
import com.practise.finance.common.result.ResultCodeEnum;
import com.practise.finance.config.OSSConfig;
import com.practise.finance.dto.OssDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    private OSSConfig ossConfig;
    @PostMapping("/testOss")
    public Result<JSONObject> test() {
        OssDto ossDto = new OssDto();
        ossDto.setUserKey(ossConfig.getUsername());
        ossDto.setPassword(ossConfig.getPassword());
        ossDto.setAddress(ossConfig.getAddress());
        ossDto.setBucket(ossConfig.getBucket());
        ossDto.setUploadName("小刘文档.doc");
        ossDto.setFileName("C:\\Users\\lky\\Desktop\\后端Java-笔试题（2021） - 刘坤宇.doc");
        boolean b = OSSUtils.uploadFile(ossDto);
        if (b) {
            return Result.build(null, ResultCodeEnum.SUCCESS);

        }
        return Result.build(null, ResultCodeEnum.FAIL);
    }
}
