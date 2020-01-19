package com.wm.springboot.shiro.filter;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @Filename: MyFormAuthenticationFilter
 * @Author: wm
 * @Date: 2020/1/9 16:08
 * @Description:
 * @History:
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        if(request instanceof HttpServletRequest){
            if (((HttpServletRequest) request).getMethod().toUpperCase().equals(RequestMethod.OPTIONS.name())){
                System.out.println("OPTIONS请求");
                return true;
            }
        }
        return super.isAccessAllowed(request, response, mappedValue);
    }
}
