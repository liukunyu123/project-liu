package com.practise.finance.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.LendReturnEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 还款记录表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Mapper
public interface LendReturnDao extends BaseMapper<LendReturnEntity> {
	
}
