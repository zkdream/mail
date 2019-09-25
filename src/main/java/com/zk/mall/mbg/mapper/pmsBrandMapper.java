package com.zk.mall.mbg.mapper;

import com.zk.mall.mbg.model.pmsBrand;
import com.zk.mall.mbg.model.pmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface pmsBrandMapper {
    int countByExample(pmsBrandExample example);

    int deleteByExample(pmsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(pmsBrand record);

    int insertSelective(pmsBrand record);

    List<pmsBrand> selectByExampleWithBLOBs(pmsBrandExample example);

    List<pmsBrand> selectByExample(pmsBrandExample example);

    pmsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") pmsBrand record, @Param("example") pmsBrandExample example);

    int updateByExampleWithBLOBs(@Param("record") pmsBrand record, @Param("example") pmsBrandExample example);

    int updateByExample(@Param("record") pmsBrand record, @Param("example") pmsBrandExample example);

    int updateByPrimaryKeySelective(pmsBrand record);

    int updateByPrimaryKeyWithBLOBs(pmsBrand record);

    int updateByPrimaryKey(pmsBrand record);
}