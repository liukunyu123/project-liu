//package com.practise.finance.service.impl;
//
//import org.springframework.stereotype.Service;
//import java.util.Map;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.Query;
//
//import io.renren.finance.generator.dao.UserIntegralDao;
//import io.renren.finance.generator.entity.UserIntegralEntity;
//import io.renren.finance.generator.service.UserIntegralService;
//
//
//@Service("userIntegralService")
//public class UserIntegralServiceImpl extends ServiceImpl<UserIntegralDao, UserIntegralEntity> implements UserIntegralService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<UserIntegralEntity> page = this.page(
//                new Query<UserIntegralEntity>().getPage(params),
//                new QueryWrapper<UserIntegralEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}