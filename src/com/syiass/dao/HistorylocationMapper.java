package com.syiass.dao;

import com.syiaas.pojo.Historylocation;

public interface HistorylocationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Historylocation record);

    int insertSelective(Historylocation record);

    Historylocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Historylocation record);

    int updateByPrimaryKey(Historylocation record);
}