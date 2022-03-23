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
//import io.renren.finance.generator.entity.LendReturnEntity;
//import io.renren.finance.generator.service.LendReturnService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 还款记录表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:21
// */
//@RestController
//@RequestMapping("generator/lendreturn")
//public class LendReturnController {
//    @Autowired
//    private LendReturnService lendReturnService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:lendreturn:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = lendReturnService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:lendreturn:info")
//    public R info(@PathVariable("id") Long id){
//		LendReturnEntity lendReturn = lendReturnService.getById(id);
//
//        return R.ok().put("lendReturn", lendReturn);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:lendreturn:save")
//    public R save(@RequestBody LendReturnEntity lendReturn){
//		lendReturnService.save(lendReturn);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:lendreturn:update")
//    public R update(@RequestBody LendReturnEntity lendReturn){
//		lendReturnService.updateById(lendReturn);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:lendreturn:delete")
//    public R delete(@RequestBody Long[] ids){
//		lendReturnService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
