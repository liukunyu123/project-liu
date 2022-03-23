package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 借款人
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Data
@TableName("borrower")
public class BorrowerEntity implements Serializable {
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
	 * 姓名
	 */
	private String name;
	/**
	 * 身份证号
	 */
	private String idCard;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 * 性别（1：男 0：女）
	 */
	private Integer sex;
	/**
	 * 年龄
	 */
	private Integer age;
	/**
	 * 学历
	 */
	private Integer education;
	/**
	 * 是否结婚（1：是 0：否）
	 */
	private Integer isMarry;
	/**
	 * 行业
	 */
	private Integer industry;
	/**
	 * 月收入
	 */
	private Integer income;
	/**
	 * 还款来源
	 */
	private Integer returnSource;
	/**
	 * 联系人名称
	 */
	private String contactsName;
	/**
	 * 联系人手机
	 */
	private String contactsMobile;
	/**
	 * 联系人关系
	 */
	private Integer contactsRelation;
	/**
	 * 状态（0：未认证，1：认证中， 2：认证通过， -1：认证失败）
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
