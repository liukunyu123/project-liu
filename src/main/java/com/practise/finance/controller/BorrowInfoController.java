//package com.practise.finance.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
///**
// * 借款信息表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/borrowinfo")
//public class BorrowInfoController {
//    @Autowired
//    private BorrowInfoService borrowInfoService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:borrowinfo:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = borrowInfoService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:borrowinfo:info")
//    public R info(@PathVariable("id") Long id){
//		BorrowInfoEntity borrowInfo = borrowInfoService.getById(id);
//
//        return R.ok().put("borrowInfo", borrowInfo);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:borrowinfo:save")
//    public R save(@RequestBody BorrowInfoEntity borrowInfo){
//		borrowInfoService.save(borrowInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:borrowinfo:update")
//    public R update(@RequestBody BorrowInfoEntity borrowInfo){
//		borrowInfoService.updateById(borrowInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:borrowinfo:delete")
//    public R delete(@RequestBody Long[] ids){
//		borrowInfoService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
