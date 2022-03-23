package com.practise.finance.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.BorrowInfoEntity;

import java.util.Map;

/**
 * 借款信息表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface BorrowInfoService extends IService<BorrowInfoEntity> {

    Page<BorrowInfoEntity> queryPage(Map<String, Object> params);
}

