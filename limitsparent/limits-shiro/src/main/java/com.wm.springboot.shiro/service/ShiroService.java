package com.wm.springboot.shiro.service;


import com.wm.springboot.model.entity.SysUser;

public interface ShiroService {
	/**
	 * 
	 * Desc: 获取登录用户信息
	 *
	 * @param name
	 * @return
	 */
	SysUser getUserByName(String name);

}
