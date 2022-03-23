package com.practise.finance.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.practise.finance.common.exception.ResException;
import com.practise.finance.common.result.Result;
import com.practise.finance.common.result.ResultCodeEnum;
import com.practise.finance.entity.IntegralGradeEntity;
import com.practise.finance.service.IntegralGradeService;
import com.practise.finance.utils.LkyStringUtils;
import com.practise.finance.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * 积分等级表
 *
 * @author lky
 * @email sunlightcs@gmail.com
 * @date 2021-05-02 16:44:21
 */
@Api(tags = "积分信息接口")
@RestController
@RequestMapping("/admin/integralgrade/finance")
@Slf4j
public class IntegralGradeController {
    @Resource(name = "integralGradeService")
    private IntegralGradeService integralGradeService;

    /**
     * 列表
     */
    @ApiOperation("获取总积分列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Result<List<IntegralGradeEntity>> list(@RequestParam Integer page,
                  @RequestParam Integer pageSize){
        List<IntegralGradeEntity> all = integralGradeService.findAll(page, pageSize);

        return Result.build(all, ResultCodeEnum.SUCCESS);
    }


    /**
     * 信息
     */
//    @RequestMapping("/info/{id}")
//    public R info(@PathVariable("id") String  id){
//        Long id1 = Long.valueOf(id);
//		IntegralGradeEntity integralGrade = integralGradeService.getById(id1);
//
//        return R.ok().put("integralGrade", integralGrade);
//    }

    /**
     * 保存
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public R save(@RequestBody IntegralGradeEntity integralGrade){
        if (integralGrade != null) {
            boolean allNotBlank = LkyStringUtils.isAllNotBlank(LkyStringUtils.convertObject(integralGrade.getIntegralStart()), LkyStringUtils.convertObject(integralGrade.getIntegralEnd()),LkyStringUtils.convertObject(integralGrade.getBorrowAmount()));
            if (!allNotBlank) {
                log.debug("参数不可为空，参数为  {}",integralGrade);
                throw new ResException(ResultCodeEnum.PARAM_ERROR);
            }
        }else {
            log.debug("参数不可为空，参数为  {}",integralGrade);
            throw new ResException(ResultCodeEnum.PARAM_ERROR);

        }
        integralGrade.setCreateTime(new Date());
        integralGrade.setUpdateTime(new Date());
		integralGradeService.save(integralGrade);

        return R.ok("新增成功");
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/updateById",method = RequestMethod.PUT)
    public R update(@RequestBody IntegralGradeEntity integralGrade){
		integralGradeService.change(integralGrade);
        return R.ok("修改成功");
    }

    /**
     * 删除
     */
    @ApiOperation("删除积分列表借口")
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Result<Object> delete(@RequestParam Integer id){
		integralGradeService.removeById(id);

        return Result.build(200,"删除成功");
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public R get(@PathVariable Long id){
        IntegralGradeEntity byId = integralGradeService.getById(id);

        return R.ok().setData(byId);
    }
}
