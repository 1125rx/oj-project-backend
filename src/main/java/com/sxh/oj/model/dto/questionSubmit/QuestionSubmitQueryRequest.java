package com.sxh.oj.model.dto.questionSubmit;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sxh.oj.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.dto.questionSubmit
 * @Project：backend
 * @name：QuestionSubmitQueryRequest
 * @Filename：QuestionSubmitQueryRequest
 * @Date：2024/3/9 10:16
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QuestionSubmitQueryRequest extends PageRequest implements Serializable {

    /**
     * 编程语言
     */
    private String language;

    /**
     * 提交状态
     */
    private Integer status;

    /**
     * 题目 id
     */
    private Long questionId;


    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;


}
