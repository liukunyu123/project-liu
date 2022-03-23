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
//import io.renren.finance.generator.entity.UserAccountEntity;
//import io.renren.finance.generator.service.UserAccountService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 用户账户
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/useraccount")
//public class UserAccountController {
//    @Autowired
//    private UserAccountService userAccountService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:useraccount:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userAccountService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:useraccount:info")
//    public R info(@PathVariable("id") Long id){
//		UserAccountEntity userAccount = userAccountService.getById(id);
//
//        return R.ok().put("userAccount", userAccount);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:useraccount:save")
//    public R save(@RequestBody UserAccountEntity userAccount){
//		userAccountService.save(userAccount);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:useraccount:update")
//    public R update(@RequestBody UserAccountEntity userAccount){
//		userAccountService.updateById(userAccount);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:useraccount:delete")
//    public R delete(@RequestBody Long[] ids){
//		userAccountService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
