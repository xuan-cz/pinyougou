package com.pinyougou.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RestController
 * 相当于配置了@Controller和@ResponseBody的组合
 * 配置@ResponseBody就不需要在每一个方法上都写了
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    /**
     * 使用引用
     * @return
     */
    @Reference
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }
}
