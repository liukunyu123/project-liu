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
//import io.renren.finance.generator.entity.TransFlowEntity;
//import io.renren.finance.generator.service.TransFlowService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 交易流水表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:21
// */
//@RestController
//@RequestMapping("generator/transflow")
//public class TransFlowController {
//    @Autowired
//    private TransFlowService transFlowService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:transflow:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = transFlowService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:transflow:info")
//    public R info(@PathVariable("id") Long id){
//		TransFlowEntity transFlow = transFlowService.getById(id);
//
//        return R.ok().put("transFlow", transFlow);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:transflow:save")
//    public R save(@RequestBody TransFlowEntity transFlow){
//		transFlowService.save(transFlow);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:transflow:update")
//    public R update(@RequestBody TransFlowEntity transFlow){
//		transFlowService.updateById(transFlow);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:transflow:delete")
//    public R delete(@RequestBody Long[] ids){
//		transFlowService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
