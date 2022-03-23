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
//import io.renren.finance.generator.dao.TransFlowDao;
//import io.renren.finance.generator.entity.TransFlowEntity;
//import io.renren.finance.generator.service.TransFlowService;
//
//
//@Service("transFlowService")
//public class TransFlowServiceImpl extends ServiceImpl<TransFlowDao, TransFlowEntity> implements TransFlowService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<TransFlowEntity> page = this.page(
//                new Query<TransFlowEntity>().getPage(params),
//                new QueryWrapper<TransFlowEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}