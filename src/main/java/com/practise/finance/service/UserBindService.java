package com.practise.finance.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.UserBindEntity;

import java.util.Map;

/**
 * 用户绑定表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface UserBindService extends IService<UserBindEntity> {

    Page<UserBindEntity> queryPage(Map<String, Object> params);
}

