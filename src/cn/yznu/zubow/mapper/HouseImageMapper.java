package cn.yznu.zubow.mapper;

import cn.yznu.zubow.entity.HouseImage;
import cn.yznu.zubow.entity.HouseImageExample;

public interface HouseImageMapper {
    int countByExample(HouseImageExample example);

    int insert(HouseImage record);

    int insertSelective(HouseImage record);
}