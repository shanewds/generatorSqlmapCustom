package com.syiass.dao;

import com.syiaas.pojo.Exhibitioninfo;

public interface ExhibitioninfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Exhibitioninfo record);

    int insertSelective(Exhibitioninfo record);

    Exhibitioninfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Exhibitioninfo record);

    int updateByPrimaryKey(Exhibitioninfo record);
}