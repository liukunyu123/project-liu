package com.practise.finance.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.practise.finance.entity.DictEntity;
import com.practise.finance.service.DictService;
import com.practise.finance.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;


/**
 * 数据字典
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:22
 */
@Api(tags = "数据字典")
@RestController
@RequestMapping("/generator/dict")
public class DictController {
    @Autowired
    private DictService dictService;

    /**
     * 列表
     */
    @ApiOperation("数据字典数据")
    @GetMapping("/list")
    public R list(){
        List<DictEntity> list = dictService.list();
        return R.ok().put("page", list);
    }

    @ApiOperation("导入Excel文件")
    @PostMapping("/import")
    public R importExcel(@RequestParam MultipartFile multipartFile) {
        List<DictEntity> list = dictService.list();
        return R.ok().put("page", list);
    }

    @ApiOperation("导出Excel文件")
    @PostMapping("/export")
    public R exportExcel( @RequestParam  String fileName, @RequestParam  String modeName) {
        if (StringUtils.isBlank(fileName) || StringUtils.isBlank(modeName)) {
            return R.error();
        }
       dictService.exportExcel(fileName,modeName);
        return R.ok();
    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:dict:info")
//    public R info(@PathVariable("id") Long id){
//		DictEntity dict = dictService.getById(id);
//
//        return R.ok().put("dict", dict);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:dict:save")
//    public R save(@RequestBody DictEntity dict){
//		dictService.save(dict);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:dict:update")
//    public R update(@RequestBody DictEntity dict){
//		dictService.updateById(dict);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:dict:delete")
//    public R delete(@RequestBody Long[] ids){
//		dictService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }

}
