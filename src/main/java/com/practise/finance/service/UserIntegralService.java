package com.practise.finance.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.UserIntegralEntity;

import java.util.Map;

/**
 * 用户积分记录表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface UserIntegralService extends IService<UserIntegralEntity> {

    Page<UserIntegralEntity> queryPage(Map<String, Object> params);
}

