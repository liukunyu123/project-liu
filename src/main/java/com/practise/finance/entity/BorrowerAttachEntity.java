package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 借款人上传资源表
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Data
@TableName("borrower_attach")
public class BorrowerAttachEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 借款人id
	 */
	private Long borrowerId;
	/**
	 * 图片类型（idCard1：身份证正面，idCard2：身份证反面，house：房产证，car：车）
	 */
	private String imageType;
	/**
	 * 图片路径
	 */
	private String imageUrl;
	/**
	 * 图片名称
	 */
	private String imageName;
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
