package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户绑定表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Data
@TableName("user_bind")
public class UserBindEntity implements Serializable {
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
	 * 用户姓名
	 */
	private String name;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 银行卡号
	 */
	private String bankNo;
	/**
	 * 银行类型
	 */
	private String bankType;
	/**
	 * 手机号
	 */
	private String mobile;
	/**
	 * 绑定账户协议号
	 */
	private String bindCode;
	/**
	 * 状态
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
