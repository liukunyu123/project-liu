package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 积分等级表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Data
@TableName("integral_grade")
public class IntegralGradeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	@JsonFormat(shape =JsonFormat.Shape.STRING)
	private Long id;
	/**
	 * 积分区间开始
	 */
	private Integer integralStart;
	/**
	 * 积分区间结束
	 */
	private Integer integralEnd;
	/**
	 * 借款额度
	 */
	private BigDecimal borrowAmount;
	/**
	 * 创建时间
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	private Date createTime;
	/**
	 * 更新时间
	 */
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
	@TableField(fill = FieldFill.INSERT_UPDATE)
	private Date updateTime;
	/**
	 * 逻辑删除(1:已删除，0:未删除)
	 */
	@TableLogic
	private Integer isDeleted;

}
