package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 品牌接口
 */
public interface BrandService {
    /**
     * 查询所有品牌列表
     */
    public List<TbBrand> findAll();
}
