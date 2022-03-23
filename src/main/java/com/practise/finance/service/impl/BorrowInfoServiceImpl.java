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
//import io.renren.finance.generator.dao.BorrowInfoDao;
//import io.renren.finance.generator.entity.BorrowInfoEntity;
//import io.renren.finance.generator.service.BorrowInfoService;
//
//
//@Service("borrowInfoService")
//public class BorrowInfoServiceImpl extends ServiceImpl<BorrowInfoDao, BorrowInfoEntity> implements BorrowInfoService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<BorrowInfoEntity> page = this.page(
//                new Query<BorrowInfoEntity>().getPage(params),
//                new QueryWrapper<BorrowInfoEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}