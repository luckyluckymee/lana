package com.lana.modules.system.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lana.modules.system.pojo.entity.SysDemanUserEntity;
import org.springframework.data.domain.PageRequest;

import java.util.HashMap;
import java.util.List;

/**
 * (SysDemanUser)表服务接口
 * @auther liuyulet
 * @since 2022-10-07 23:16:36
 */
public interface SysDemanUserService extends IService<SysDemanUserEntity> {


    List<HashMap<String, Object>> getAllOver(String demanId);
}