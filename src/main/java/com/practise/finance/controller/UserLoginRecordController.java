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
//import io.renren.finance.generator.entity.UserLoginRecordEntity;
//import io.renren.finance.generator.service.UserLoginRecordService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 用户登录记录表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/userloginrecord")
//public class UserLoginRecordController {
//    @Autowired
//    private UserLoginRecordService userLoginRecordService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:userloginrecord:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userLoginRecordService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:userloginrecord:info")
//    public R info(@PathVariable("id") Long id){
//		UserLoginRecordEntity userLoginRecord = userLoginRecordService.getById(id);
//
//        return R.ok().put("userLoginRecord", userLoginRecord);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:userloginrecord:save")
//    public R save(@RequestBody UserLoginRecordEntity userLoginRecord){
//		userLoginRecordService.save(userLoginRecord);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:userloginrecord:update")
//    public R update(@RequestBody UserLoginRecordEntity userLoginRecord){
//		userLoginRecordService.updateById(userLoginRecord);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:userloginrecord:delete")
//    public R delete(@RequestBody Long[] ids){
//		userLoginRecordService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
