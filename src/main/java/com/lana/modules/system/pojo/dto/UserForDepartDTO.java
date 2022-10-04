/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.lana.modules.system.pojo.dto;

import lombok.Data;

/**
 * 密码表单
 *
 * @auther liuyulet
 */
@Data
public class UserForDepartDTO {
    /**
     * 机构id
     */
    private Integer departId;
    /**
     * 用户id
     */
    private int[] userId;

}