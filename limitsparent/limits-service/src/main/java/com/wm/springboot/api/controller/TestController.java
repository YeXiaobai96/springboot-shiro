package com.wm.springboot.api.controller;

import com.wm.springboot.api.service.TestService;
import com.wm.springboot.common.model.Result;
import com.wm.springboot.model.entity.Test;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Set;

/**
 * @Filename: TestController
 * @Author: wm
 * @Date: 2019/9/2 15:44
 * @Description:
 * @History:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public Object list(HttpServletRequest request) {
        Enumeration<String> headers = request.getHeaderNames();
        headers.hasMoreElements();
        while (headers.hasMoreElements()) {
            System.out.println(request.getHeader(headers.nextElement()));
        }
        System.out.println(SecurityUtils.getSubject().hasRole("test"));
        return testService.list();
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public Object add(@RequestBody Test test) {
        return testService.add(test);
    }


    @RequestMapping(value = "test1", method = RequestMethod.POST)
    public Object test1() {
        Set<String> list=(Set<String>) SecurityUtils.getSubject().getSession().getAttribute("roles");
        return list;
    }

    @GetMapping("unauth")
    public Object unauth() {
        Result result = Result.builder()
                .code(10000)
                .flag(false)
                .msg("未登录")
                .data("未登录")
                .build();
        return result;
    }
}
