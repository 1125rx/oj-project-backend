package com.sxh.oj.model.dto.question;

import com.sxh.oj.common.PageRequest;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.dto.question
 * @Project：backend
 * @name：QuestionQueryRequest
 * @Filename：QuestionQueryRequest
 * @Date：2024/3/9 10:12
 */
@Data
public class QuestionQueryRequest extends PageRequest implements Serializable {
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
    private List<String> tags;

    /**
     * 题目答案
     */
    private String answer;

    /**
     * 创建用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;

}
