package com.practise.finance.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.UserAccountEntity;

import java.util.Map;

/**
 * 用户账户
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface UserAccountService extends IService<UserAccountEntity> {

    Page<UserAccountEntity> queryPage(Map<String, Object> params);
}

