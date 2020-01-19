package com.wm.springboot.dao;

import com.wm.springboot.model.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserMapper {

    SysUser findUserById(String id);

    SysUser findUserByName(String name);

    int deleteById(String id);

    int saveUser(SysUser user);

    int updateUserById(SysUser user);
}