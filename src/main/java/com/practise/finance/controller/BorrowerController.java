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
//import io.renren.finance.generator.entity.BorrowerEntity;
//import io.renren.finance.generator.service.BorrowerService;
//import com.practise.common.utils.PageUtils;
//import com.practise.common.utils.R;
//
//
//
///**
// * 借款人
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/borrower")
//public class BorrowerController {
//    @Autowired
//    private BorrowerService borrowerService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:borrower:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = borrowerService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:borrower:info")
//    public R info(@PathVariable("id") Long id){
//		BorrowerEntity borrower = borrowerService.getById(id);
//
//        return R.ok().put("borrower", borrower);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:borrower:save")
//    public R save(@RequestBody BorrowerEntity borrower){
//		borrowerService.save(borrower);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:borrower:update")
//    public R update(@RequestBody BorrowerEntity borrower){
//		borrowerService.updateById(borrower);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:borrower:delete")
//    public R delete(@RequestBody Long[] ids){
//		borrowerService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
