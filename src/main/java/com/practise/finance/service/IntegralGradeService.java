package com.practise.finance.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.IntegralGradeEntity;

import java.util.List;
import java.util.Map;

/**
 * 积分等级表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
public interface IntegralGradeService extends IService<IntegralGradeEntity> {


    Page queryPage(Map<String, Object> params);

    List<IntegralGradeEntity> findAll(Integer page, Integer pageSize);

    void change(IntegralGradeEntity integralGrade);
}

