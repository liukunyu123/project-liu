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
//import io.renren.finance.generator.entity.UserInfoEntity;
//import io.renren.finance.generator.service.UserInfoService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 用户基本信息
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/userinfo")
//public class UserInfoController {
//    @Autowired
//    private UserInfoService userInfoService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:userinfo:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userInfoService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:userinfo:info")
//    public R info(@PathVariable("id") Long id){
//		UserInfoEntity userInfo = userInfoService.getById(id);
//
//        return R.ok().put("userInfo", userInfo);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:userinfo:save")
//    public R save(@RequestBody UserInfoEntity userInfo){
//		userInfoService.save(userInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:userinfo:update")
//    public R update(@RequestBody UserInfoEntity userInfo){
//		userInfoService.updateById(userInfo);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:userinfo:delete")
//    public R delete(@RequestBody Long[] ids){
//		userInfoService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
