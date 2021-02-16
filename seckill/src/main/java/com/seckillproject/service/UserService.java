package com.seckillproject.service;

import com.seckillproject.error.BusinessException;
import com.seckillproject.service.model.UserModel;

public interface UserService {

    //通过用户ID获取用户对象的方法
    UserModel getUserById(Integer id);

    //用户注册
    void register(UserModel userModel) throws BusinessException;

    /*
    * 用户登录
    * telphone: 用户注册手机
    * encrptPassword: 用户加密后的密码
    * */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;

}
