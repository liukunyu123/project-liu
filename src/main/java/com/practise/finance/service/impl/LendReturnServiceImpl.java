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
//import io.renren.finance.generator.dao.LendReturnDao;
//import io.renren.finance.generator.entity.LendReturnEntity;
//import io.renren.finance.generator.service.LendReturnService;
//
//
//@Service("lendReturnService")
//public class LendReturnServiceImpl extends ServiceImpl<LendReturnDao, LendReturnEntity> implements LendReturnService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<LendReturnEntity> page = this.page(
//                new Query<LendReturnEntity>().getPage(params),
//                new QueryWrapper<LendReturnEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}