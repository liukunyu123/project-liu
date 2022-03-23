package com.practise.finance.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ExcelDto {
    @ExcelProperty(value = "id")
    private Long id;
    @ExcelProperty(value = "上级id")
    private  Long parentId;
    @ExcelProperty(value = "名称")
    private String  name;
    @ExcelProperty(value = "值")
    private Integer  value;
    @ExcelProperty(value = "编码")
    private String  dictCode;
}
