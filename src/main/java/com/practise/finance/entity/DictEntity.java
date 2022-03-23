package com.practise.finance.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 数据字典
 * 
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Data
@TableName("dict")
public class DictEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 上级id
	 */
	private Long parentId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 值
	 */
	private Integer value;
	/**
	 * 编码
	 */
	private String dictCode;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 删除标记（0:不可用 1:可用）
	 */
	private Integer isDeleted;

}
