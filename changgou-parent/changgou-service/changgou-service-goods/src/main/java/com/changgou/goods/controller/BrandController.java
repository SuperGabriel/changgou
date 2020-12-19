package com.changgou.goods.controller;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.BrandService;
import com.github.pagehelper.PageInfo;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gabriel
 */
@RestController
@RequestMapping(value = "/brand")
@CrossOrigin //跨域
public class BrandController {

    @Autowired
    private BrandService brandService;

    /*
     * 分页查询
     * */
    @PostMapping(value = "/search/{page}/{size}")
    public Result<PageInfo<Brand>> findPage(@RequestBody Brand brand, @PathVariable(value = "page") Integer page,
                                            @PathVariable(value = "size") Integer size) {
        PageInfo<Brand> pageInfo = brandService.findPage(page, size, brand);
        return new Result<>(true, StatusCode.OK, "分页查询成功！", pageInfo);
    }

    /*
     * 分页查询
     * */
    @GetMapping(value = "/search/{page}/{size}")
    public Result<PageInfo<Brand>> findPage(@PathVariable(value = "page") Integer page,
                                            @PathVariable(value = "size") Integer size) {
        PageInfo<Brand> pageInfo = brandService.findPage(page, size);
        return new Result<>(true, StatusCode.OK, "分页查询成功！", pageInfo);
    }

    /*
     * 条件查询
     * */
    @PostMapping(value = "/search")
    public Result<List<Brand>> findList(@RequestBody Brand brand) {
        List<Brand> brandList = brandService.findList(brand);
        return new Result<>(true, StatusCode.OK, "查询品牌集合成功！", brandList);
    }

    /*
     * 根据ID删除品牌数据
     * */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable(value = "id") Integer id) {
        brandService.delete(id);
        return new Result(true, StatusCode.OK, "删除品牌成功！");
    }

    /*
     * 根据ID修改品牌数据
     * */
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable(value = "id") Integer id, @RequestBody Brand brand) {
        brand.setId(id);
        brandService.update(brand);
        return new Result(true, StatusCode.OK, "修改品牌成功！");
    }

    /*
     * 增加品牌
     * */
    @PostMapping
    public Result add(@RequestBody Brand brand) {
        brandService.add(brand);
        return new Result(true, StatusCode.OK, "增加品牌成功！");
    }

    /*
     * 根据主键id查询
     * */
    @GetMapping(value = "/{id}")
    public Result<Brand> findById(@PathVariable(value = "id") Integer id) {
        Brand brand = brandService.findById(id);
        return new Result<>(true, StatusCode.OK, "根据id查询Brand成功！", brand);
    }

    /*
     * 查询所有
     * */
    @GetMapping
    public Result<List<Brand>> findAll() {
        List<Brand> brandList = brandService.findAll();
        return new Result<>(true, StatusCode.OK, "查询品牌集合成功！", brandList);
    }
}
