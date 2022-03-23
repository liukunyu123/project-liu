//package com.practise.finance.controller;
//
//import java.util.Arrays;
//import java.util.Map;
//
//import com.practise.finance.service.BorrowerAttachService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//
//
///**
// * 借款人上传资源表
// *
// * @author lky
// * @email sunlightcs@gmail.com
// * @date 2021-05-02 16:44:22
// */
//@RestController
//@RequestMapping("generator/borrowerattach")
//public class BorrowerAttachController {
//    @Autowired
//    private BorrowerAttachService borrowerAttachService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = borrowerAttachService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:borrowerattach:info")
//    public R info(@PathVariable("id") Long id){
//		BorrowerAttachEntity borrowerAttach = borrowerAttachService.getById(id);
//
//        return R.ok().put("borrowerAttach", borrowerAttach);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:borrowerattach:save")
//    public R save(@RequestBody BorrowerAttachEntity borrowerAttach){
//		borrowerAttachService.save(borrowerAttach);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:borrowerattach:update")
//    public R update(@RequestBody BorrowerAttachEntity borrowerAttach){
//		borrowerAttachService.updateById(borrowerAttach);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:borrowerattach:delete")
//    public R delete(@RequestBody Long[] ids){
//		borrowerAttachService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
