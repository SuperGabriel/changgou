package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;

import java.util.List;

/**
 * @author Gabriel
 */
public interface BrandService {

    /*
    * 根据ID删除品牌
    * */
    void delete(Integer id);
    /*
     * 根据ID修改品牌数据
     * */
    void update(Brand brand);

    /**
     * 增加品牌
     *
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
