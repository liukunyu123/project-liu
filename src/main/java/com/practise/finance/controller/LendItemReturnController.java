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
//import io.renren.finance.generator.entity.LendItemReturnEntity;
//import io.renren.finance.generator.service.LendItemReturnService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 标的出借回款记录表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:21
// */
//@RestController
//@RequestMapping("generator/lenditemreturn")
//public class LendItemReturnController {
//    @Autowired
//    private LendItemReturnService lendItemReturnService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:lenditemreturn:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = lendItemReturnService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:lenditemreturn:info")
//    public R info(@PathVariable("id") Long id){
//		LendItemReturnEntity lendItemReturn = lendItemReturnService.getById(id);
//
//        return R.ok().put("lendItemReturn", lendItemReturn);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:lenditemreturn:save")
//    public R save(@RequestBody LendItemReturnEntity lendItemReturn){
//		lendItemReturnService.save(lendItemReturn);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:lenditemreturn:update")
//    public R update(@RequestBody LendItemReturnEntity lendItemReturn){
//		lendItemReturnService.updateById(lendItemReturn);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:lenditemreturn:delete")
//    public R delete(@RequestBody Long[] ids){
//		lendItemReturnService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
