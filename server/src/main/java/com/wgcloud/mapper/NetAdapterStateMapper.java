package com.wgcloud.mapper;

import com.wgcloud.entity.NetAdapterState;

import java.util.List;
import java.util.Map;

/**
 * 查看网卡信息
 */
public interface NetAdapterStateMapper {
    List<NetAdapterState> selectAllByParams(Map<String, Object> map) throws Exception;

    int deleteByAccHname(Map<String, Object> paramsDel) throws Exception;

    void insertList(List<NetAdapterState> recordList) throws Exception;
}
