package com.practise.finance.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.practise.finance.entity.DictEntity;

import java.util.List;
import java.util.Map;

/**
 * 数据字典
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
public interface DictService extends IService<DictEntity> {

    void exportExcel(String fileName, String modeName);
}

