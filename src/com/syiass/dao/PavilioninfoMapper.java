package com.syiass.dao;

import com.syiaas.pojo.Pavilioninfo;

public interface PavilioninfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Pavilioninfo record);

    int insertSelective(Pavilioninfo record);

    Pavilioninfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Pavilioninfo record);

    int updateByPrimaryKey(Pavilioninfo record);
}