package com.practise.finance.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.LendItemEntity;

import java.util.Map;

/**
 * 标的出借记录表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
public interface LendItemService extends IService<LendItemEntity> {

    Page<LendItemEntity> queryPage(Map<String, Object> params);
}

