package com.practise.finance.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.BorrowerAttachEntity;

import java.util.Map;

/**
 * 借款人上传资源表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface BorrowerAttachService extends IService<BorrowerAttachEntity> {

    Page<BorrowerAttachEntity> queryPage(Map<String, Object> params);
}

