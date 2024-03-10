package com.sxh.oj.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.dto.question
 * @Project：backend
 * @name：QuestionListRequest
 * @Filename：QuestionListRequest
 * @Date：2024/3/10 12:26
 */
@Data
public class QuestionListRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表
     */
    private String tags;

    /**
     * 创建用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}
