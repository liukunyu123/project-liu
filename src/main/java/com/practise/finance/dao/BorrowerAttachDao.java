package com.practise.finance.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.practise.finance.entity.BorrowerAttachEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 借款人上传资源表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Mapper
public interface BorrowerAttachDao extends BaseMapper<BorrowerAttachEntity> {
	
}
