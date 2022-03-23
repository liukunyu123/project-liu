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
//import io.renren.finance.generator.dao.UserAccountDao;
//import io.renren.finance.generator.entity.UserAccountEntity;
//import io.renren.finance.generator.service.UserAccountService;
//
//
//@Service("userAccountService")
//public class UserAccountServiceImpl extends ServiceImpl<UserAccountDao, UserAccountEntity> implements UserAccountService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<UserAccountEntity> page = this.page(
//                new Query<UserAccountEntity>().getPage(params),
//                new QueryWrapper<UserAccountEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}