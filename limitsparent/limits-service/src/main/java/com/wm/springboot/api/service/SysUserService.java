package com.wm.springboot.api.service;

import com.wm.springboot.model.entity.SysUser;

/**
 * @Filename: SysUserService
 * @Author: wm
 * @Date: 2020/1/14 15:55
 * @Description:
 * @History:
 */
public interface SysUserService {

    SysUser findUserById(String id);

    SysUser findUserByName(String name);

    int deleteById(String id);

    int saveUser(SysUser record);

    int updateUserById(SysUser record);
}
