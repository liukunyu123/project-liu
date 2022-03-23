package com.practise.finance.config;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.practise.finance.dto.ExcelDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelDictListener extends AnalysisEventListener<ExcelDto> {


    @Override
    public void invoke(ExcelDto excelDto, AnalysisContext analysisContext) {
        log.info("解析到一条数据:  {}",excelDto);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
      log.info("文件数据解析完成--------------------------------");
    }
}
