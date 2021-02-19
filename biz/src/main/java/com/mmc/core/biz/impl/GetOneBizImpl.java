package com.mmc.core.biz.impl;

import com.mmc.core.biz.GetOneBiz;
import com.mmc.core.service.GetOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * TODO
 *
 * @author zhiqiang_zhao
 * @date 2021/2/18 10:37
 */
@Service
public class GetOneBizImpl implements GetOneBiz {
    @Autowired
    private GetOneService getOneService;
    @Override
    public String getOne(String name){
        System.out.println(getOneService.getOne(name));
        return name;
    }
}
