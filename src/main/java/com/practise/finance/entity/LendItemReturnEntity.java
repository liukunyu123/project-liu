package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 标的出借回款记录表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Data
@TableName("lend_item_return")
public class LendItemReturnEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 标的还款id
	 */
	private Long lendReturnId;
	/**
	 * 标的项id
	 */
	private Long lendItemId;
	/**
	 * 标的id
	 */
	private Long lendId;
	/**
	 * 出借用户id
	 */
	private Long investUserId;
	/**
	 * 出借金额
	 */
	private BigDecimal investAmount;
	/**
	 * 当前的期数
	 */
	private Integer currentPeriod;
	/**
	 * 年化利率
	 */
	private BigDecimal lendYearRate;
	/**
	 * 还款方式 1-等额本息 2-等额本金 3-每月还息一次还本 4-一次还本
	 */
	private Integer returnMethod;
	/**
	 * 本金
	 */
	private BigDecimal principal;
	/**
	 * 利息
	 */
	private BigDecimal interest;
	/**
	 * 本息
	 */
	private BigDecimal total;
	/**
	 * 手续费
	 */
	private BigDecimal fee;
	/**
	 * 还款时指定的还款日期
	 */
	private Date returnDate;
	/**
	 * 实际发生的还款时间
	 */
	private Date realReturnTime;
	/**
	 * 是否逾期
	 */
	private Integer isOverdue;
	/**
	 * 逾期金额
	 */
	private BigDecimal overdueTotal;
	/**
	 * 状态（0-未归还 1-已归还）
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
