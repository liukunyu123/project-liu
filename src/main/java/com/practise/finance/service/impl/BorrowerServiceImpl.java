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
//import io.renren.finance.generator.dao.BorrowerDao;
//import io.renren.finance.generator.entity.BorrowerEntity;
//import io.renren.finance.generator.service.BorrowerService;
//
//
//@Service("borrowerService")
//public class BorrowerServiceImpl extends ServiceImpl<BorrowerDao, BorrowerEntity> implements BorrowerService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<BorrowerEntity> page = this.page(
//                new Query<BorrowerEntity>().getPage(params),
//                new QueryWrapper<BorrowerEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}