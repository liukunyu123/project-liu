package com.practise.finance.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.practise.finance.common.exception.GlobalExceptionHandler;
import com.practise.finance.common.exception.ResException;
import com.practise.finance.dao.IntegralGradeDao;
import com.practise.finance.entity.IntegralGradeEntity;
import com.practise.finance.service.IntegralGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;



@Service("integralGradeService")
public class IntegralGradeServiceImpl extends ServiceImpl<IntegralGradeDao, IntegralGradeEntity> implements IntegralGradeService {
    @Resource
    private IntegralGradeDao integralGradeDao;

    @Override
    public Page queryPage(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<IntegralGradeEntity> findAll(Integer page,Integer pageSize) {
        Page<IntegralGradeEntity> pageData = new Page<>();
        pageData.setCurrent(page);
        pageData.setSize(pageSize);


        Page<IntegralGradeEntity> pageTotal = integralGradeDao.selectPage(pageData, null);
        List<IntegralGradeEntity> records = pageTotal.getRecords();

        return records;


    }

    @Override
    public void change(IntegralGradeEntity integralGrade) {
        if (integralGrade.getIntegralStart() > integralGrade.getIntegralEnd()) {
            throw new ResException("积分区间错误请重新输入",500);
        }
        updateById(integralGrade);
    }
}