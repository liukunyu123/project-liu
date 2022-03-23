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
//import io.renren.finance.generator.dao.LendItemReturnDao;
//import io.renren.finance.generator.entity.LendItemReturnEntity;
//import io.renren.finance.generator.service.LendItemReturnService;
//
//
//@Service("lendItemReturnService")
//public class LendItemReturnServiceImpl extends ServiceImpl<LendItemReturnDao, LendItemReturnEntity> implements LendItemReturnService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<LendItemReturnEntity> page = this.page(
//                new Query<LendItemReturnEntity>().getPage(params),
//                new QueryWrapper<LendItemReturnEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}