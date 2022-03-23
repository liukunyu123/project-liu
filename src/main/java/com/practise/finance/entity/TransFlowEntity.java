package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 交易流水表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Data
@TableName("trans_flow")
public class TransFlowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 交易单号
	 */
	private String transNo;
	/**
	 * 交易类型（1：充值 2：提现 3：投标 4：投资回款 ...）
	 */
	private Integer transType;
	/**
	 * 交易类型名称
	 */
	private String transTypeName;
	/**
	 * 交易金额
	 */
	private BigDecimal transAmount;
	/**
	 * 备注
	 */
	private String memo;
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
