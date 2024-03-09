package com.sxh.oj.judge.codeSandbox.model;

import lombok.Data;

/**
 * @Author：SongXH
 * @Package：com.sxh.oj.judge.codeSandbox.model
 * @Project：backend
 * @name：JudgeInfo
 * @Filename：JudgeInfo
 * @Date：2024/3/9 10:42
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;

}
