package com.practise.finance.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.UserBindEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户绑定表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Mapper
public interface UserBindDao extends BaseMapper<UserBindEntity> {
	
}
