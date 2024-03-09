package com.sxh.oj.model.dto.question;

import lombok.Data;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.dto.question
 * @Project：backend
 * @name：JudgeCase
 * @Filename：JudgeCase
 * @Date：2024/3/9 10:07
 */
@Data
public class JudgeCase {

    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;

}
