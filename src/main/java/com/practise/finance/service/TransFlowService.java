package com.practise.finance.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.TransFlowEntity;

import java.util.Map;

/**
 * 交易流水表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
public interface TransFlowService extends IService<TransFlowEntity> {

    Page<TransFlowEntity> queryPage(Map<String, Object> params);
}

