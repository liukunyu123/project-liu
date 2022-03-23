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
//import io.renren.finance.generator.entity.UserIntegralEntity;
//import io.renren.finance.generator.service.UserIntegralService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 用户积分记录表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/userintegral")
//public class UserIntegralController {
//    @Autowired
//    private UserIntegralService userIntegralService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:userintegral:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userIntegralService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:userintegral:info")
//    public R info(@PathVariable("id") Long id){
//		UserIntegralEntity userIntegral = userIntegralService.getById(id);
//
//        return R.ok().put("userIntegral", userIntegral);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:userintegral:save")
//    public R save(@RequestBody UserIntegralEntity userIntegral){
//		userIntegralService.save(userIntegral);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:userintegral:update")
//    public R update(@RequestBody UserIntegralEntity userIntegral){
//		userIntegralService.updateById(userIntegral);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:userintegral:delete")
//    public R delete(@RequestBody Long[] ids){
//		userIntegralService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
