package com.practise.finance.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.UserInfoEntity;

import java.util.Map;

/**
 * 用户基本信息
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface UserInfoService extends IService<UserInfoEntity> {

    Page<UserInfoEntity> queryPage(Map<String, Object> params);
}

