package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;

import java.util.List;

/**
 * @author Gabriel
 */
public interface BrandService {

    /**
     * 增加品牌
     * @param brand
     */
    void add(Brand brand);
    /*
    * 根据id查询
    * */
    Brand findById(Integer id);
    /*
    * 查询所有
    * */
    List<Brand> findAll();
}
