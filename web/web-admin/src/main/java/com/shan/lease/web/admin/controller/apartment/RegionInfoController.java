package com.shan.lease.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.shan.lease.common.result.Result;
import com.shan.lease.model.entity.CityInfo;
import com.shan.lease.model.entity.DistrictInfo;
import com.shan.lease.model.entity.ProvinceInfo;
import com.shan.lease.web.admin.service.CityInfoService;
import com.shan.lease.web.admin.service.DistrictInfoService;
import com.shan.lease.web.admin.service.ProvinceInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "地区信息管理")
@RestController
@RequestMapping("/admin/region")
public class RegionInfoController {

    @Autowired
    private ProvinceInfoService provinceInfoService;

    @Autowired
    private CityInfoService cityInfoService;

    @Autowired
    private DistrictInfoService districtInfoService;

    @Operation(summary = "查询省份信息列表")
    @GetMapping("province/list")
    public Result<List<ProvinceInfo>> listProvince() {
        List<ProvinceInfo> provinceInfoList = provinceInfoService.list();
        return Result.ok(provinceInfoList);
    }

    @Operation(summary = "根据省份id查询城市信息列表")
    @GetMapping("city/listByProvinceId")
    public Result<List<CityInfo>> listCityInfoByProvinceId(@RequestParam Long id) {
        LambdaQueryWrapper<CityInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(id != null, CityInfo::getProvinceId, id);
        List<CityInfo> cityInfoList = cityInfoService.list(queryWrapper);
        return Result.ok(cityInfoList);
    }

    @GetMapping("district/listByCityId")
    @Operation(summary = "根据城市id查询区县信息")
    public Result<List<DistrictInfo>> listDistrictInfoByCityId(@RequestParam Long id) {
        LambdaQueryWrapper<DistrictInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(id != null, DistrictInfo::getCityId, id);
        List<DistrictInfo> districtInfoList = districtInfoService.list(queryWrapper);
        return Result.ok(districtInfoList);
    }

}
