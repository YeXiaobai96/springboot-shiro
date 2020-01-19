package com.wm.springboot.api.base;

import com.wm.springboot.dao.SysUserMapper;
import com.wm.springboot.model.entity.SysUser;
import com.wm.springboot.shiro.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Filename: ShiroServiceImpl
 * @Author: wm
 * @Date: 2020/1/14 16:43
 * @Description:
 * @History:
 */
@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public SysUser getUserByName(String name) {
        return sysUserMapper.findUserByName(name);
    }
}
