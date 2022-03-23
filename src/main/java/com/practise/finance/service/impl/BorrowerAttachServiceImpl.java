//package com.practise.finance.service.impl;
//
//import org.springframework.stereotype.Service;
//import java.util.Map;
//
//
//@Service("borrowerAttachService")
//public class BorrowerAttachServiceImpl extends ServiceImpl<BorrowerAttachDao, BorrowerAttachEntity> implements BorrowerAttachService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<BorrowerAttachEntity> page = this.page(
//                new Query<BorrowerAttachEntity>().getPage(params),
//                new QueryWrapper<BorrowerAttachEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}