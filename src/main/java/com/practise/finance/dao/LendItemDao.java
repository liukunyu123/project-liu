package com.practise.finance.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.LendItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 标的出借记录表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Mapper
public interface LendItemDao extends BaseMapper<LendItemEntity> {
	
}
