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
//import io.renren.finance.generator.entity.UserBindEntity;
//import io.renren.finance.generator.service.UserBindService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 用户绑定表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/userbind")
//public class UserBindController {
//    @Autowired
//    private UserBindService userBindService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:userbind:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userBindService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:userbind:info")
//    public R info(@PathVariable("id") Long id){
//		UserBindEntity userBind = userBindService.getById(id);
//
//        return R.ok().put("userBind", userBind);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:userbind:save")
//    public R save(@RequestBody UserBindEntity userBind){
//		userBindService.save(userBind);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:userbind:update")
//    public R update(@RequestBody UserBindEntity userBind){
//		userBindService.updateById(userBind);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:userbind:delete")
//    public R delete(@RequestBody Long[] ids){
//		userBindService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
