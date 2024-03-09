package com.sxh.oj.model.vo;

import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.vo
 * @Project：backend
 * @name：UserProfileVO
 * @Filename：UserProfileVO
 * @Date：2024/3/7 10:23
 */
@Data
public class UserProfileVO implements Serializable {

    /**
     * 用户现居地
     */
    private String location;
    /**
     * 用户学校
     */
    private String school;
    /**
     * 用户性别
     */
    private String gender;
    /**
     * 用户简介
     */
    private String description;
    /**
     * 用户生日
     */
    private Date birthday;
    /**
     * 用户邮箱
     */
    private String emailAddress;
    /**
     * 用户博客地址
     */
    private String githubUrl;

    private static final long serialVersionUID = 1L;

    /**
     * 将用户信息转换为json字符串
     *
     * @param userProfileVO 用户信息
     * @return json字符串
     */
    public static String profileToJson(UserProfileVO userProfileVO) {
        return JSONUtil.toJsonStr(userProfileVO);
    }
    /**
     * 将json字符串转换为用户信息
     *
     * @param json json字符串
     * @return 用户信息
     */
    public static UserProfileVO jsonToProfile(String json) {
        return JSONUtil.toBean(json, UserProfileVO.class);
    }
    /**
     * 初始化用户信息
     *
     * @return 用户信息
     */
    private static String initProfile(){
        UserProfileVO userProfileVO = new UserProfileVO();
        //所有元素设置为空值
        userProfileVO.setLocation("");
        userProfileVO.setSchool("");
        userProfileVO.setGender("");
        userProfileVO.setDescription("这个人很懒，什么都没有留下。");
        userProfileVO.setBirthday(new Date());
        userProfileVO.setEmailAddress("");
        userProfileVO.setGithubUrl("");
        return profileToJson(userProfileVO);
    }



}
