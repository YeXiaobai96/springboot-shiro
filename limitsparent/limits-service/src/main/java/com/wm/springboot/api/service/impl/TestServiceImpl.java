package com.wm.springboot.api.service.impl;

import com.wm.springboot.api.service.TestService;
import com.wm.springboot.dao.TestMapper;
import com.wm.springboot.model.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Filename: TestServiceImpl
 * @Author: wm
 * @Date: 2019/9/3 9:14
 * @Description:
 * @History:
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> list() {
        List<Test> list=testMapper.list();
        return list;
    }

    @Override
    public int add(Test test) {
        int b=testMapper.add(test);
        return b;
    }
}
