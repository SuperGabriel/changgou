package com.changgou.goods.service;

import com.changgou.goods.pojo.Brand;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author Gabriel
 */
public interface BrandService {

    /*
     * 分页+条件搜索
     * @param brand:搜索条件
     * @param page:当前页
     * @param size:每页显示的条数
     * */
    PageInfo<Brand> findPage(Integer page, Integer size, Brand brand);

    /*
     * 条件搜索
     * @param page:当前页
     * @param size:每页显示的条数
     * */
    PageInfo<Brand> findPage(Integer page, Integer size);

    /*
     * 根据品牌信息多条件查询
     * */
    List<Brand> findList(Brand brand);

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
