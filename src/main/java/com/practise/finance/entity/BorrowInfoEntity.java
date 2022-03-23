package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 借款信息表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Data
@TableName("borrow_info")
public class BorrowInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 借款用户id
	 */
	private Long userId;
	/**
	 * 借款金额
	 */
	private BigDecimal amount;
	/**
	 * 借款期限
	 */
	private Integer period;
	/**
	 * 年化利率
	 */
	private BigDecimal borrowYearRate;
	/**
	 * 还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本
	 */
	private Integer returnMethod;
	/**
	 * 资金用途
	 */
	private Integer moneyUse;
	/**
	 * 状态（0：未提交，1：审核中， 2：审核通过， -1：审核不通过）
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
