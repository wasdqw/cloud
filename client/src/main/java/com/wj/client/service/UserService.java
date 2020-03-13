package com.wj.client.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.iflytek.wj.entity.UserInfo;
import com.wj.client.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:
 * Function:
 * date:2020年03月13日 16:27
 *
 * @author jiewang27
 * @version 1.0
 * @since JDK 1.7
 */
@Service("userService")
public class UserService extends ServiceImpl<UserInfoMapper, UserInfo> {

    public List<UserInfo> userList(){
        return baseMapper.selectList(new QueryWrapper<>());
    }
}
