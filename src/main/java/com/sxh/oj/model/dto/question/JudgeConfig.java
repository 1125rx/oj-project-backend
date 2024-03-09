package com.sxh.oj.model.dto.question;

import lombok.Data;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.model.dto.question
 * @Project：backend
 * @name：JudgeConfig
 * @Filename：JudgeConfig
 * @Date：2024/3/9 10:05
 */

@Data
public class JudgeConfig {
    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;


}
