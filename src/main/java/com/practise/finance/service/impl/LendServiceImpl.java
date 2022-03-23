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
//import io.renren.finance.generator.dao.LendDao;
//import io.renren.finance.generator.entity.LendEntity;
//import io.renren.finance.generator.service.LendService;
//
//
//@Service("lendService")
//public class LendServiceImpl extends ServiceImpl<LendDao, LendEntity> implements LendService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<LendEntity> page = this.page(
//                new Query<LendEntity>().getPage(params),
//                new QueryWrapper<LendEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}