package com.wm.springboot.dao;

import com.wm.springboot.model.entity.Test;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Filename: TestMapper
 * @Author: wm
 * @Date: 2019/9/2 15:42
 * @Description:
 * @History:
 */
@Repository
public interface TestMapper {

    List<Test> list();


    int add(Test test);

}
