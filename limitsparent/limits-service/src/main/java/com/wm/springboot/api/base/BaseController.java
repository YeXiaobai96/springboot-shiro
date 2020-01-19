package com.wm.springboot.api.base;

import com.wm.springboot.model.entity.UserInfo;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;

/**
 * 
 * All rights Reserved, Designed By dumingchun
 * 
 * @Title: BaseController.java
 * @Package com.app.ztfgj.man.api
 * @Description: TODO
 * @author: dumingchun
 * @date: 2018年10月30日 上午10:42:24
 * @version:
 *
 */
@Slf4j
public abstract class BaseController {

	protected UserInfo getUser() {
		return (UserInfo) SecurityUtils.getSubject().getPrincipal();
	}

	protected String getUserId() {
		log.info("日志测试{}",getUser().toString());
		return getUser().getId();
	}
	 
}
