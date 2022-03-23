package com.practise.finance.service.impl;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practise.finance.dao.DictDao;
import com.practise.finance.dto.ExcelDto;
import com.practise.finance.entity.DictEntity;
import com.practise.finance.service.DictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Slf4j
@Service("dictService")
public class DictServiceImpl extends ServiceImpl<DictDao, DictEntity> implements DictService {

    @Override
    public void exportExcel(String fileName,String modeName) {
        List<DictEntity> list = this.list();
        List<ExcelDto> listExcelData = new LinkedList<>();
        for (DictEntity dictEntity : list) {
            ExcelDto excelDto = new ExcelDto();
            BeanUtils.copyProperties(dictEntity, excelDto);
            log.info("当前的excel数据为:  {}",excelDto);
            listExcelData.add(excelDto);
        }
        EasyExcel.write(fileName, ExcelDto.class).sheet(modeName).doWrite(listExcelData);

    }
}