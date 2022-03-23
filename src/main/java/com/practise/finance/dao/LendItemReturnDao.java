package com.practise.finance.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.LendItemReturnEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 标的出借回款记录表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Mapper
public interface LendItemReturnDao extends BaseMapper<LendItemReturnEntity> {
	
}
