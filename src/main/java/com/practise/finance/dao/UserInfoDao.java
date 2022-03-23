package com.practise.finance.dao;



import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.UserInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户基本信息
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Mapper
public interface UserInfoDao extends BaseMapper<UserInfoEntity> {
	
}
