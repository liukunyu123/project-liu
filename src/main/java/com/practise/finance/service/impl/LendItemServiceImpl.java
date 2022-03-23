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
//import io.renren.finance.generator.dao.LendItemDao;
//import io.renren.finance.generator.entity.LendItemEntity;
//import io.renren.finance.generator.service.LendItemService;
//
//
//@Service("lendItemService")
//public class LendItemServiceImpl extends ServiceImpl<LendItemDao, LendItemEntity> implements LendItemService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<LendItemEntity> page = this.page(
//                new Query<LendItemEntity>().getPage(params),
//                new QueryWrapper<LendItemEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}