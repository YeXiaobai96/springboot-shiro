package com.wm.springboot.api.controller;

import com.wm.springboot.api.base.BaseController;
import com.wm.springboot.api.service.LoginService;
import com.wm.springboot.common.config.ExceptionEnum;
import com.wm.springboot.common.util.ResultUtil;
import com.wm.springboot.model.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Filename: LoginController
 * @Author: wm
 * @Date: 2020/1/14 16:19
 * @Description:
 * @History:
 */
@RestController
@RequestMapping("admin")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;
    @PostMapping("login")
    public Object login(@RequestBody SysUser user) {
        if (StringUtils.isEmpty(user.getCode()) || StringUtils.isEmpty(user.getPassword())) {
            return ResultUtil.error(ExceptionEnum.PARAM_NULL);
        }
        return loginService.login(user);
    }

    @PostMapping("register")
    public Object register(@RequestBody SysUser user) {

        return null;
    }
}
