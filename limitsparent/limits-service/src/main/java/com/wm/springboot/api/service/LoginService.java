package com.wm.springboot.api.service;

import com.wm.springboot.common.model.Result;
import com.wm.springboot.model.entity.SysUser;

/**
 * @Filename: LoginService
 * @Author: wm
 * @Date: 2020/1/14 16:23
 * @Description:
 * @History:
 */
public interface LoginService {

    Result login(SysUser user);

    Result register(SysUser user);
}
