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
//import io.renren.finance.generator.dao.UserBindDao;
//import io.renren.finance.generator.entity.UserBindEntity;
//import io.renren.finance.generator.service.UserBindService;
//
//
//@Service("userBindService")
//public class UserBindServiceImpl extends ServiceImpl<UserBindDao, UserBindEntity> implements UserBindService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<UserBindEntity> page = this.page(
//                new Query<UserBindEntity>().getPage(params),
//                new QueryWrapper<UserBindEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}