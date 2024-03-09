package com.sxh.oj.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sxh.oj.model.dto.questionSubmit.QuestionSubmitAddRequest;
import com.sxh.oj.model.dto.questionSubmit.QuestionSubmitQueryRequest;
import com.sxh.oj.model.entity.QuestionSubmit;
import com.sxh.oj.model.entity.User;
import com.sxh.oj.model.vo.QuestionSubmitVO;
import com.sxh.oj.service.QuestionSubmitService;
import com.sxh.oj.mapper.QuestionSubmitMapper;
import org.springframework.stereotype.Service;

/**
* @author song
* @description 针对表【question_submit(题目提交)】的数据库操作Service实现
* @createDate 2024-03-09 09:50:52
*/
@Service
public class QuestionSubmitServiceImpl extends ServiceImpl<QuestionSubmitMapper, QuestionSubmit>
    implements QuestionSubmitService{

    @Override
    public long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser) {
        return 0;
    }

    @Override
    public QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest) {
        return null;
    }

    @Override
    public QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser) {
        return null;
    }

    @Override
    public Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser) {
        return null;
    }
}




