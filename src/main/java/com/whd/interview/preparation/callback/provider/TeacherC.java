package com.whd.interview.preparation.callback.provider;

import com.whd.interview.preparation.callback.abs.AbstractCallBack;
import com.whd.interview.preparation.callback.calculator.Student;
import com.whd.interview.preparation.callback.entity.Answer;
import com.whd.interview.preparation.callback.entity.Question;

import java.util.List;
import java.util.Queue;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/22 23:28
 * @apiNote Describe the function of this class in one sentence
 **/
public class TeacherC extends AbstractCallBack {

    public TeacherC(Student student) {
        super(student);
    }

    /***
     * 老师像学生提出多个问题，具体实现由子类实现
     * @param queue 问题队列
     * @return {@link List<Answer>}
     */
    @Override
    protected List<Answer> askQuestions(Queue<Question> queue) {
        return null;
    }
}
