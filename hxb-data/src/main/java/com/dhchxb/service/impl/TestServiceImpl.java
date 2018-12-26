package com.dhchxb.service.impl;

import com.dhchxb.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 1:37 PM 2018/12/25
 * @Modified By:
 */
@Service("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String test(String cityName) {
        return "beijing is the capital of china!!!";
    }
}
