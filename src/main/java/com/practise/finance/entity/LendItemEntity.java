package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 标的出借记录表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Data
@TableName("lend_item")
public class LendItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 投资编号
	 */
	private String lendItemNo;
	/**
	 * 标的id
	 */
	private Long lendId;
	/**
	 * 投资用户id
	 */
	private Long investUserId;
	/**
	 * 投资人名称
	 */
	private String investName;
	/**
	 * 投资金额
	 */
	private BigDecimal investAmount;
	/**
	 * 年化利率
	 */
	private BigDecimal lendYearRate;
	/**
	 * 投资时间
	 */
	private Date investTime;
	/**
	 * 开始日期
	 */
	private Date lendStartDate;
	/**
	 * 结束日期
	 */
	private Date lendEndDate;
	/**
	 * 预期收益
	 */
	private BigDecimal expectAmount;
	/**
	 * 实际收益
	 */
	private BigDecimal realAmount;
	/**
	 * 状态（0：默认 1：已支付 2：已还款）
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 逻辑删除(1:已删除，0:未删除)
	 */
	private Integer isDeleted;

}
