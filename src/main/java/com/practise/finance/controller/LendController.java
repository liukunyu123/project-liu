//package com.practise.finance.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.renren.finance.generator.entity.LendEntity;
//import io.renren.finance.generator.service.LendService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 标的准备表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:21
// */
//@RestController
//@RequestMapping("generator/lend")
//public class LendController {
//    @Autowired
//    private LendService lendService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:lend:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = lendService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:lend:info")
//    public R info(@PathVariable("id") Long id){
//		LendEntity lend = lendService.getById(id);
//
//        return R.ok().put("lend", lend);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:lend:save")
//    public R save(@RequestBody LendEntity lend){
//		lendService.save(lend);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:lend:update")
//    public R update(@RequestBody LendEntity lend){
//		lendService.updateById(lend);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:lend:delete")
//    public R delete(@RequestBody Long[] ids){
//		lendService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
