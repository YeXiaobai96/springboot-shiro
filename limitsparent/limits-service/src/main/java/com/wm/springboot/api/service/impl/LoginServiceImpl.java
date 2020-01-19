package com.wm.springboot.api.service.impl;

import com.wm.springboot.api.service.LoginService;
import com.wm.springboot.common.model.Result;
import com.wm.springboot.common.util.ResultUtil;
import com.wm.springboot.dao.SysUserMapper;
import com.wm.springboot.model.entity.SysUser;
import com.wm.springboot.model.entity.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @Filename: LoginServiceImpl
 * @Author: wm
 * @Date: 2020/1/14 16:24
 * @Description:
 * @History:
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public Result login(SysUser user) {
        //对前端传过来的用户名密码进行进行解决处理 此处省略
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getCode(), user.getPassword());
        try {
            subject.login(token);
            SysUser userInfo=(SysUser) subject.getPrincipal();
            Map<String,Object> map = new HashMap<>(2);
            map.put("token", subject.getSession().getId().toString());
            map.put("user",userInfo);
            return ResultUtil.success(map);
        } catch (IncorrectCredentialsException e) {
            //密码错误
            return ResultUtil.error(10001,"ERROR_LOGIN_PASSWORD");
        } catch (ExcessiveAttemptsException e) {
            return ResultUtil.error(10001,"重试次数过多");
        } catch (LockedAccountException e) {
            //账号被禁用
            return ResultUtil.error(10001,"账号被禁用");
        } catch (AuthenticationException e) {
            //该用户不存在
            return ResultUtil.error(10001,"用户不存在");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(10001,"异常错误");
        }
    }

    @Override
    public Result register(SysUser user) {
        return null;
    }
}
