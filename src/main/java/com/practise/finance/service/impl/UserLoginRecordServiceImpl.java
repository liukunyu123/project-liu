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
//import io.renren.finance.generator.dao.UserLoginRecordDao;
//import io.renren.finance.generator.entity.UserLoginRecordEntity;
//import io.renren.finance.generator.service.UserLoginRecordService;
//
//
//@Service("userLoginRecordService")
//public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordDao, UserLoginRecordEntity> implements UserLoginRecordService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<UserLoginRecordEntity> page = this.page(
//                new Query<UserLoginRecordEntity>().getPage(params),
//                new QueryWrapper<UserLoginRecordEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}