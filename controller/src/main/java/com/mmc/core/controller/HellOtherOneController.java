package com.mmc.core.controller;

import com.mmc.core.api.HellOtherOneApi;
import com.mmc.core.biz.GetOneBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author zhiqiang_zhao
 * @date 2021/2/18 9:58
 */
@RestController
@RequestMapping(value = "/coreHello")
public class HellOtherOneController implements HellOtherOneApi {
    @Autowired
    private GetOneBiz getOneBiz;
    @RequestMapping(value = "/getOne" ,method = RequestMethod.GET)
    public String getOne(@RequestParam(name = "yourName") String yourName){
        getOneBiz.getOne(yourName);
        return "匹配--"+yourName;
    }
}
