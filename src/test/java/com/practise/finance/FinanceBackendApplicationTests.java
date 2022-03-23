package com.practise.finance;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.metadata.property.LoopMergeProperty;
import com.alibaba.excel.util.DateUtils;
import com.alibaba.excel.write.merge.LoopMergeStrategy;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.practise.finance.config.OSSConfig;
import com.practise.finance.dto.ExcelDto;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//package com.practise.finance;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import org.apache.ibatis.annotations.Mapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
@SpringBootTest
@RunWith(SpringRunner.class)
public class FinanceBackendApplicationTests {
    @Autowired
    private OSSConfig ossConfig;

    @Test
    public void test1() {
        System.out.println(ossConfig.getAddress());
        System.out.println(ossConfig.getBucket());
        System.out.println(ossConfig.getUsername());
        System.out.println(ossConfig.getPassword());

    }
    @Test
    public void test() throws FileNotFoundException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "https://oss-cn-beijing.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
        String accessKeyId = "LTAI5tA6Q3yAGAhpvnrYWkHa";
        String accessKeySecret = "GjbUKTLXWBc3r97u5BqgEMH0dVkHn7";
// <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        boolean xiaoliushangcheng = ossClient.doesBucketExist("xiaoliushangcheng");
        System.out.println(xiaoliushangcheng);
// 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
//        InputStream inputStream = null;
//            inputStream = new FileInputStream("C:\\Users\\lky\\Desktop\\公安部交接文档.doc");
            ossClient.putObject("xiaoliushangcheng", "公安部交接文档.doc", new File("C:\\Users\\lky\\Desktop\\公安部交接文档.doc"));
            ossClient.shutdown();


// 填写Bucket名称和Object完整路径。Object完整路径中不能包含Bucket名称。

// 关闭OSSClient。
    }
//    private List<ExcelDto> data() {
//        List<ExcelDto> list = new ArrayList<ExcelDto>();
//        for (int i = 0; i < 10; i++) {
//            ExcelDto data = new ExcelDto();
//            data.setName("字符串" + i);
////            list.add(data);
//        }
//        return list;
//    }
//
//
//    @Test
//    public void mergeWrite() {
//        // 方法1 注解
////        String fileName = "C:\\Users\\lky\\Desktop\\test.xlsx";
////        // 在DemoStyleData里面加上ContentLoopMerge注解
////        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
////        EasyExcel.write(fileName, ExcelDto.class).sheet("模板").doWrite(data());
//
//        // 方法2 自定义合并单元格策略
//        String fileName = "C:\\Users\\lky\\Desktop\\test.xlsx";
//        // 每隔2行会合并 把eachColumn 设置成 3 也就是我们数据的长度，所以就第一列会合并。当然其他合并策略也可以自己写
//        LoopMergeStrategy loopMergeStrategy = new LoopMergeStrategy(2, 0);
//        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
//        EasyExcel.write(fileName, ExcelDto.class).registerWriteHandler(loopMergeStrategy).sheet("模板").doWrite(data());
//    }
}
