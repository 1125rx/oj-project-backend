package com.sxh.oj.model.dto.questionSubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.dto.questionSubmit
 * @Project：backend
 * @name：QuestionSubmitAddRequest
 * @Filename：QuestionSubmitAddRequest
 * @Date：2024/3/9 10:15
 *
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    /**
     * 题目 id
     */
    private Long questionId;

    private static final long serialVersionUID = 1L;

}
