package com.mmc.core.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface HellOtherOneApi {
    @RequestMapping(value = "hello/getOne" ,method = RequestMethod.GET)
    public String getOne(@RequestParam(name = "yourName") String yourName);
}
