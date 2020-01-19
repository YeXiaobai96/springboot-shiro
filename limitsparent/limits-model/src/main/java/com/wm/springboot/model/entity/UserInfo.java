package com.wm.springboot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @Filename: UserInfo
 * @Author: wm
 * @Date: 2020/1/8 15:54
 * @Description:
 * @History:
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserInfo implements Serializable {

    private String name;
    private String password;
    private String salt;
    private String id;
    private Integer state;

}
