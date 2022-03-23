package com.practise.finance.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.BorrowInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 借款信息表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Mapper
public interface BorrowInfoDao extends BaseMapper<BorrowInfoEntity> {
	
}
