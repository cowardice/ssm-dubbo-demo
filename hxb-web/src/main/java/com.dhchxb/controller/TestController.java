package com.dhchxb.controller;

import com.dhchxb.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 4:39 PM 2018/12/25
 * @Modified By:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/aa")
    public String test(HttpServletRequest request) throws Exception{
//        return "aa";
        return testService.test("beijing");
    }
}
