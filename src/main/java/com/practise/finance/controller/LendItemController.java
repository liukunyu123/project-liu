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
//import io.renren.finance.generator.entity.LendItemEntity;
//import io.renren.finance.generator.service.LendItemService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 标的出借记录表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:21
// */
//@RestController
//@RequestMapping("generator/lenditem")
//public class LendItemController {
//    @Autowired
//    private LendItemService lendItemService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:lenditem:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = lendItemService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:lenditem:info")
//    public R info(@PathVariable("id") Long id){
//		LendItemEntity lendItem = lendItemService.getById(id);
//
//        return R.ok().put("lendItem", lendItem);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:lenditem:save")
//    public R save(@RequestBody LendItemEntity lendItem){
//		lendItemService.save(lendItem);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:lenditem:update")
//    public R update(@RequestBody LendItemEntity lendItem){
//		lendItemService.updateById(lendItem);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:lenditem:delete")
//    public R delete(@RequestBody Long[] ids){
//		lendItemService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
