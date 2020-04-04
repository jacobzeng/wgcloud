package com.wgcloud.service;

import com.wgcloud.entity.NetAdapterState;
import com.wgcloud.mapper.NetAdapterStateMapper;
import com.wgcloud.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class NetAdapterStateService {
    @Autowired
    private NetAdapterStateMapper netAdapterStateMapper;

    public List<NetAdapterState> selectAllByParams(Map<String, Object> params) throws Exception {
        return netAdapterStateMapper.selectAllByParams(params);
    }

    public int deleteByAccHname(Map<String, Object> paramsDel) throws Exception {
        return netAdapterStateMapper.deleteByAccHname(paramsDel);
    }

    @Transactional
    public void saveRecords(List<NetAdapterState> recordList) throws Exception {
        if (recordList.size() < 1) {
            return;
        }
        for (NetAdapterState as : recordList) {
            as.setId(UUIDUtil.getUUID());
        }
        netAdapterStateMapper.insertList(recordList);
    }
}
