package com.practise.finance.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.UserLoginRecordEntity;

import java.util.Map;

/**
 * 用户登录记录表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface UserLoginRecordService extends IService<UserLoginRecordEntity> {

    Page<UserLoginRecordEntity> queryPage(Map<String, Object> params);
}

