package com.wm.springboot.api.service.impl;

import com.wm.springboot.api.service.SysUserService;
import com.wm.springboot.common.util.UuidUtils;
import com.wm.springboot.dao.SysUserMapper;
import com.wm.springboot.model.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Filename: SysUserServiceImpl
 * @Author: wm
 * @Date: 2020/1/14 15:56
 * @Description:
 * @History:
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser findUserById(String id) {
        return sysUserMapper.findUserById(id);
    }

    @Override
    public SysUser findUserByName(String name) {
        return sysUserMapper.findUserByName(name);
    }

    @Override
    public int deleteById(String id) {
        return sysUserMapper.deleteById(id);
    }

    @Override
    public int saveUser(SysUser record) {
        record.setId(UuidUtils.randomUUID());
        record.setStatus(0);
        record.setDelFlag(0);
        record.setCreatedOn(new Date());
        record.setModifiedOn(new Date());
        return sysUserMapper.saveUser(record);
    }

    @Override
    public int updateUserById(SysUser record) {
        record.setModifiedOn(new Date());
        return sysUserMapper.updateUserById(record);
    }
}
